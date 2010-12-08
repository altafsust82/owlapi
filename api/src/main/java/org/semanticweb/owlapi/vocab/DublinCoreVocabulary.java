package org.semanticweb.owlapi.vocab;

import org.semanticweb.owlapi.model.IRI;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;
/*
 * Copyright (C) 2007, University of Manchester
 *
 * Modifications to the initial code base are copyright of their
 * respective authors, or their employers as appropriate.  Authorship
 * of the modifications may be determined from the ChangeLog placed at
 * the end of this file.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.

 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */


/**
 * Author: Matthew Horridge<br>
 * The University Of Manchester<br>
 * Bio-Health Informatics Group<br>
 * Date: 09-Mar-2007<br><br>
 */
public enum DublinCoreVocabulary {

    CONTRIBUTOR("contributor"),
    COVERAGE("coverage"),
    CREATOR("creator"),
    DATE("date"),
    DESCRIPTION("description"),
    FORMAT("format"),
    IDENTIFIER("identifier"),
    LANGUAGE("language"),
    PUBLISHER("publisher"),
    RELATION("relation"),
    RIGHTS("rights"),
    SOURCE("source"),
    SUBJECT("subject"),
    TITLE("title"),
    TYPE("type");

    private String shortName;

    private String qname;

    private IRI iri;

    public static final String NAME_SPACE = "http://purl.org/dc/elements/1.1/";


    DublinCoreVocabulary(String name) {
        shortName = name;
        qname = "dc:" + name;
        iri = IRI.create(NAME_SPACE + name);
    }

    public String getShortName() {
        return shortName;
    }

    public String getQName() {
        return qname;
    }

    public URI getURI() {
        return iri.toURI();
    }

    public IRI getIRI() {
        return iri;
    }

    public static final Set<IRI> ALL_URIS;


    static {
        ALL_URIS = new HashSet<IRI>();
        for (DublinCoreVocabulary v : DublinCoreVocabulary.values()) {
            ALL_URIS.add(v.getIRI());
        }
    }


    public String toString() {
        return iri.toString();
    }
}
