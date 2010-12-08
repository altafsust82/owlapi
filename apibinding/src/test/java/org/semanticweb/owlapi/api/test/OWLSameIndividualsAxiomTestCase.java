package org.semanticweb.owlapi.api.test;

import java.util.Set;

import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLObject;


/**
 * Author: Matthew Horridge<br>
 * The University Of Manchester<br>
 * Bio-Health Informatics Group
 * Date: 25-Oct-2006
 */
public class OWLSameIndividualsAxiomTestCase extends AbstractOWLNaryOperandsObjectTestCase<OWLIndividual> {

    protected OWLObject createObject(Set<OWLIndividual> operands) throws Exception {
        return getFactory().getOWLSameIndividualAxiom(operands);
    }


    protected OWLIndividual createOperand() throws Exception {
        return createOWLIndividual();
    }
}
