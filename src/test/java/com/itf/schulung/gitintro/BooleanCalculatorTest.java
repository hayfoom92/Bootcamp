package com.itf.schulung.gitintro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BooleanCalculatorTest {

	//TODO: Raise Boolean Calculator Test to 100% Coverage
	
	    @Test
	    @DisplayName("Testing the AND function")
	    public void andTest() {
	        // assert statements
	    	BooleanCalculator booleanCalculator = new BooleanCalculator();
	    	assertEquals(true, booleanCalculator.and(true, true), "true and true must return true");
	    	assertEquals(false, booleanCalculator.and(true, false), "true and false must return false");
	    	assertEquals(false, booleanCalculator.and(false, false), "false and false must return true");
	    	assertEquals(false, booleanCalculator.and(false, true), "false and true must return false");
	    }
	    
	    @Test
	    @DisplayName("Testing the OR function")
	    public void orTest() {
	    	BooleanCalculator booleanCalculator = new BooleanCalculator();
	    	assertEquals(true, booleanCalculator.or(true, true), "true or true must return true");
	    	assertEquals(true, booleanCalculator.or(false, true), "false or true must return true");
	    	assertEquals(false, booleanCalculator.or(false, false), "false or false must return false");
	    	assertEquals(true, booleanCalculator.or(true, false), "true or false must return true");
	    }
	    
	    @Test
	    @DisplayName("Testing the specialAND function")
	    public void specialAndTest() {
	    	BooleanCalculator booleanCalculator = new BooleanCalculator();
	    	List<Boolean> boolList = null;
	    	assertFalse(booleanCalculator.specialAnd(boolList), "boolList null must return false");
	    	
	    	boolList = new ArrayList<Boolean>();
	    	boolList.add(true);
	    	assertFalse(booleanCalculator.specialAnd(boolList), "boolList 1 must return false");
	    	
	    	boolList.add(true);
	    	boolList.add(true);
	    	boolList.add(true);
	    	boolList.add(true);
	    	assertFalse(booleanCalculator.specialAnd(boolList), "boolList 5 must be false");
	    	
	    	boolList.add(true);
	    	boolList.add(false);
	    	assertFalse(booleanCalculator.specialAnd(boolList), "andBool must be false");

	    }
}
