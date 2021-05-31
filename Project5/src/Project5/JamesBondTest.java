package Project5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JamesBondTest 
{
	JamesBond x;
	@Before
	public void setUp() throws Exception 
	{
		x = new JamesBond();
		
	}

	@After
	public void tearDown() throws Exception 
	{
		x=null;
	}
	
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JamesBondTest.class);
	}


	@Test
	public void testCase0 () {
	assertFalse(x.bondRegex("("));
	}
	@Test
	public void testCase1 () {
	assertFalse(x.bondRegex("( ("));
	}
	@Test
	public void testCase2 () {
	assertFalse(x.bondRegex("( ( ("));
	}
	@Test
	public void testCase3 () {
	assertFalse(x.bondRegex("( ( )"));
	}
	@Test
	public void testCase4 () {
	assertTrue(x.bondRegex("( ( 0 0 7 )"));
	}
	@Test
	public void testCase5 () {
	assertFalse(x.bondRegex("( ( 0 7 )"));
	}
	@Test
	public void testCase6 () {
	assertFalse(x.bondRegex("( ( 7 )"));
	}
	@Test
	public void testCase7 () {
	assertFalse(x.bondRegex("( )"));
	}
	@Test
	public void testCase8 () {
	assertFalse(x.bondRegex("( ) ("));
	}
	@Test
	public void testCase9 () {
	assertFalse(x.bondRegex("( ) )"));
	}
	@Test
	public void testCase10 () {
	assertTrue(x.bondRegex("( ) 0 0 7 )"));
	}
	@Test
	public void testCase11 () {
	assertFalse(x.bondRegex("( ) 0 7 )"));
	}
	@Test
	public void testCase12 () {
	assertFalse(x.bondRegex("( ) 7 )"));
	}
	@Test
	public void testCase13 () {
	assertFalse(x.bondRegex("( 0 ("));
	}
	@Test
	public void testCase14 () {
	assertFalse(x.bondRegex("( 0 ( ("));
	}
	@Test
	public void testCase15 () {
	assertFalse(x.bondRegex("( 0 ( )"));
	}
	@Test
	public void testCase16 () {
	assertTrue(x.bondRegex("( 0 ( 0 0 7 )"));
	}
	@Test
	public void testCase17 () {
	assertFalse(x.bondRegex("( 0 ( 0 7 )"));
	}
	@Test
	public void testCase18 () {
	assertFalse(x.bondRegex("( 0 ( 7 )"));
	}
	@Test
	public void testCase19 () {
	assertFalse(x.bondRegex("( 0 )"));
	}
	@Test
	public void testCase20 () {
	assertFalse(x.bondRegex("( 0 ) ("));
	}
	@Test
	public void testCase21 () {
	assertFalse(x.bondRegex("( 0 ) )"));
	}
	@Test
	public void testCase22 () {
	assertTrue(x.bondRegex("( 0 ) 0 0 7 )"));
	}
	@Test
	public void testCase23 () {
	assertFalse(x.bondRegex("( 0 ) 0 7 )"));
	}
	@Test
	public void testCase24 () {
	assertFalse(x.bondRegex("( 0 ) 7 )"));
	}
	@Test
	public void testCase25 () {
	assertFalse(x.bondRegex("( 0 0 ("));
	}
	@Test
	public void testCase26 () {
	assertFalse(x.bondRegex("( 0 0 ( ("));
	}
	@Test
	public void testCase27 () {
	assertFalse(x.bondRegex("( 0 0 ( )"));
	}
	@Test
	public void testCase28 () {
	assertTrue(x.bondRegex("( 0 0 ( 0 0 7 )"));
	}
	@Test
	public void testCase29 () {
	assertFalse(x.bondRegex("( 0 0 ( 0 7 )"));
	}
	@Test
	public void testCase30 () {
	assertFalse(x.bondRegex("( 0 0 ( 7 )"));
	}
	@Test
	public void testCase31 () {
	assertFalse(x.bondRegex("( 0 0 )"));
	}
	@Test
	public void testCase32 () {
	assertFalse(x.bondRegex("( 0 0 ) ("));
	}
	@Test
	public void testCase33 () {
	assertFalse(x.bondRegex("( 0 0 ) )"));
	}
	@Test
	public void testCase34 () {
	assertTrue(x.bondRegex("( 0 0 ) 0 0 7 )"));
	}
	@Test
	public void testCase35 () {
	assertFalse(x.bondRegex("( 0 0 ) 0 7 )"));
	}
	@Test
	public void testCase36 () {
	assertFalse(x.bondRegex("( 0 0 ) 7 )"));
	}
	@Test
	public void testCase37 () {
	assertFalse(x.bondRegex("( 0 0 0 ("));
	}
	@Test
	public void testCase38 () {
	assertFalse(x.bondRegex("( 0 0 0 )"));
	}
	@Test
	public void testCase39 () {
	assertTrue(x.bondRegex("( 0 0 0 0 0 7 )"));
	}
	@Test
	public void testCase40 () {
	assertTrue(x.bondRegex("( 0 0 0 0 7 )"));
	}
	@Test
	public void testCase41 () {
	assertTrue(x.bondRegex("( 0 0 0 7 )"));
	}
	@Test
	public void testCase42 () {
	assertFalse(x.bondRegex("( 0 0 1 ("));
	}
	@Test
	public void testCase43 () {
	assertFalse(x.bondRegex("( 0 0 1 )"));
	}
	@Test
	public void testCase44 () {
	assertTrue(x.bondRegex("( 0 0 1 0 0 7 )"));
	}
	@Test
	public void testCase45 () {
	assertFalse(x.bondRegex("( 0 0 1 0 7 )"));
	}
	@Test
	public void testCase46 () {
	assertFalse(x.bondRegex("( 0 0 1 7 )"));
	}
	@Test
	public void testCase47 () {
	assertFalse(x.bondRegex("( 0 0 2 ("));
	}
	@Test
	public void testCase48 () {
	assertFalse(x.bondRegex("( 0 0 2 )"));
	}
	@Test
	public void testCase49 () {
	assertTrue(x.bondRegex("( 0 0 2 0 0 7 )"));
	}
	@Test
	public void testCase50 () {
	assertFalse(x.bondRegex("( 0 0 2 0 7 )"));
	}
	@Test
	public void testCase51 () {
	assertFalse(x.bondRegex("( 0 0 2 7 )"));
	}
	@Test
	public void testCase52 () {
	assertFalse(x.bondRegex("( 0 0 3 ("));
	}
	@Test
	public void testCase53 () {
	assertFalse(x.bondRegex("( 0 0 3 )"));
	}
	@Test
	public void testCase54 () {
	assertTrue(x.bondRegex("( 0 0 3 0 0 7 )"));
	}
	@Test
	public void testCase55 () {
	assertFalse(x.bondRegex("( 0 0 3 0 7 )"));
	}
	@Test
	public void testCase56 () {
	assertFalse(x.bondRegex("( 0 0 3 7 )"));
	}
	@Test
	public void testCase57 () {
	assertFalse(x.bondRegex("( 0 0 4 ("));
	}
	@Test
	public void testCase58 () {
	assertFalse(x.bondRegex("( 0 0 4 )"));
	}
	@Test
	public void testCase59 () {
	assertTrue(x.bondRegex("( 0 0 4 0 0 7 )"));
	}
	@Test
	public void testCase60 () {
	assertFalse(x.bondRegex("( 0 0 4 0 7 )"));
	}
	@Test
	public void testCase61 () {
	assertFalse(x.bondRegex("( 0 0 4 7 )"));
	}
	@Test
	public void testCase62 () {
	assertFalse(x.bondRegex("( 0 0 5 ("));
	}
	@Test
	public void testCase63 () {
	assertFalse(x.bondRegex("( 0 0 5 )"));
	}
	@Test
	public void testCase64 () {
	assertTrue(x.bondRegex("( 0 0 5 0 0 7 )"));
	}
	@Test
	public void testCase65 () {
	assertFalse(x.bondRegex("( 0 0 5 0 7 )"));
	}
	@Test
	public void testCase66 () {
	assertFalse(x.bondRegex("( 0 0 5 7 )"));
	}
	@Test
	public void testCase67 () {
	assertFalse(x.bondRegex("( 0 0 6 ("));
	}
	@Test
	public void testCase68 () {
	assertFalse(x.bondRegex("( 0 0 6 )"));
	}
	@Test
	public void testCase69 () {
	assertTrue(x.bondRegex("( 0 0 6 0 0 7 )"));
	}
	@Test
	public void testCase70 () {
	assertFalse(x.bondRegex("( 0 0 6 0 7 )"));
	}
	@Test
	public void testCase71 () {
	assertFalse(x.bondRegex("( 0 0 6 7 )"));
	}
	@Test
	public void testCase72 () {
	assertFalse(x.bondRegex("( 0 0 7 ("));
	}
	@Test
	public void testCase73 () {
	assertFalse(x.bondRegex("( 0 0 7 ( ("));
	}
	@Test
	public void testCase74 () {
	assertTrue(x.bondRegex("( 0 0 7 ( )"));
	}
	@Test
	public void testCase75 () {
	assertTrue(x.bondRegex("( 0 0 7 ( 0 0 7 )"));
	}
	@Test
	public void testCase76 () {
	assertTrue(x.bondRegex("( 0 0 7 ( 0 7 )"));
	}
	@Test
	public void testCase77 () {
	assertTrue(x.bondRegex("( 0 0 7 ( 7 )"));
	}
	@Test
	public void testCase78 () {
	assertTrue(x.bondRegex("( 0 0 7 )"));
	}
	@Test
	public void testCase79 () {
	assertTrue(x.bondRegex("( 0 0 7 ) ("));
	}
	@Test
	public void testCase80 () {
	assertTrue(x.bondRegex("( 0 0 7 ) ( ("));
	}
	@Test
	public void testCase81 () {
	assertTrue(x.bondRegex("( 0 0 7 ) ( )"));
	}
	@Test
	public void testCase82 () {
	assertTrue(x.bondRegex("( 0 0 7 ) ( 0 0 7 )"));
	}
	@Test
	public void testCase83 () {
	assertTrue(x.bondRegex("( 0 0 7 ) ( 0 7 )"));
	}
	@Test
	public void testCase84 () {
	assertTrue(x.bondRegex("( 0 0 7 ) ( 7 )"));
	}
	@Test
	public void testCase85 () {
	assertTrue(x.bondRegex("( 0 0 7 ) )"));
	}
	@Test
	public void testCase86 () {
	assertTrue(x.bondRegex("( 0 0 7 ) ) ("));
	}
	@Test
	public void testCase87 () {
	assertTrue(x.bondRegex("( 0 0 7 ) ) )"));
	}
	@Test
	public void testCase88 () {
	assertTrue(x.bondRegex("( 0 0 7 ) ) 0 0 7 )"));
	}
	@Test
	public void testCase89 () {
	assertTrue(x.bondRegex("( 0 0 7 ) ) 0 7 )"));
	}
	@Test
	public void testCase90 () {
	assertTrue(x.bondRegex("( 0 0 7 ) ) 7 )"));
	}
	@Test
	public void testCase91 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 0 ("));
	}
	@Test
	public void testCase92 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 0 )"));
	}
	@Test
	public void testCase93 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 0 0 0 7 )"));
	}
	@Test
	public void testCase94 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 0 0 7 )"));
	}
	@Test
	public void testCase95 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 0 7 )"));
	}
	@Test
	public void testCase96 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 1 ("));
	}
	@Test
	public void testCase97 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 1 )"));
	}
	@Test
	public void testCase98 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 1 0 0 7 )"));
	}
	@Test
	public void testCase99 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 1 0 7 )"));
	}
	@Test
	public void testCase100 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 1 7 )"));
	}
	@Test
	public void testCase101 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 2 ("));
	}
	@Test
	public void testCase102 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 2 )"));
	}
	@Test
	public void testCase103 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 2 0 0 7 )"));
	}
	@Test
	public void testCase104 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 2 0 7 )"));
	}
	@Test
	public void testCase105 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 2 7 )"));
	}
	@Test
	public void testCase106 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 3 ("));
	}
	@Test
	public void testCase107 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 3 )"));
	}
	@Test
	public void testCase108 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 3 0 0 7 )"));
	}
	@Test
	public void testCase109 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 3 0 7 )"));
	}
	@Test
	public void testCase110 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 3 7 )"));
	}
	@Test
	public void testCase111 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 4 ("));
	}
	@Test
	public void testCase112 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 4 )"));
	}
	@Test
	public void testCase113 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 4 0 0 7 )"));
	}
	@Test
	public void testCase114 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 4 0 7 )"));
	}
	@Test
	public void testCase115 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 4 7 )"));
	}
	@Test
	public void testCase116 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 5 ("));
	}
	@Test
	public void testCase117 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 5 )"));
	}
	@Test
	public void testCase118 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 5 0 0 7 )"));
	}
	@Test
	public void testCase119 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 5 0 7 )"));
	}
	@Test
	public void testCase120 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 5 7 )"));
	}
	@Test
	public void testCase121 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 6 ("));
	}
	@Test
	public void testCase122 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 6 )"));
	}
	@Test
	public void testCase123 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 6 0 0 7 )"));
	}
	@Test
	public void testCase124 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 6 0 7 )"));
	}
	@Test
	public void testCase125 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 6 7 )"));
	}
	@Test
	public void testCase126 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 7 ("));
	}
	@Test
	public void testCase127 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 7 )"));
	}
	@Test
	public void testCase128 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 7 0 0 7 )"));
	}
	@Test
	public void testCase129 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 7 0 7 )"));
	}
	@Test
	public void testCase130 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 7 7 )"));
	}
	@Test
	public void testCase131 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 8 ("));
	}
	@Test
	public void testCase132 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 8 )"));
	}
	@Test
	public void testCase133 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 8 0 0 7 )"));
	}
	@Test
	public void testCase134 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 8 0 7 )"));
	}
	@Test
	public void testCase135 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 8 7 )"));
	}
	@Test
	public void testCase136 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 9 ("));
	}
	@Test
	public void testCase137 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 9 )"));
	}
	@Test
	public void testCase138 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 9 0 0 7 )"));
	}
	@Test
	public void testCase139 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 9 0 7 )"));
	}
	@Test
	public void testCase140 () {
	assertTrue(x.bondRegex("( 0 0 7 ) 9 7 )"));
	}
	@Test
	public void testCase141 () {
	assertFalse(x.bondRegex("( 0 0 7 0 ("));
	}
	@Test
	public void testCase142 () {
	assertTrue(x.bondRegex("( 0 0 7 0 )"));
	}
	@Test
	public void testCase143 () {
	assertTrue(x.bondRegex("( 0 0 7 0 0 0 7 )"));
	}
	@Test
	public void testCase144 () {
	assertTrue(x.bondRegex("( 0 0 7 0 0 7 )"));
	}
	@Test
	public void testCase145 () {
	assertTrue(x.bondRegex("( 0 0 7 0 7 )"));
	}
	@Test
	public void testCase146 () {
	assertFalse(x.bondRegex("( 0 0 7 1 ("));
	}
	@Test
	public void testCase147 () {
	assertTrue(x.bondRegex("( 0 0 7 1 )"));
	}
	@Test
	public void testCase148 () {
	assertTrue(x.bondRegex("( 0 0 7 1 0 0 7 )"));
	}
	@Test
	public void testCase149 () {
	assertTrue(x.bondRegex("( 0 0 7 1 0 7 )"));
	}
	@Test
	public void testCase150 () {
	assertTrue(x.bondRegex("( 0 0 7 1 7 )"));
	}
	@Test
	public void testCase151 () {
	assertFalse(x.bondRegex("( 0 0 7 2 ("));
	}
	@Test
	public void testCase152 () {
	assertTrue(x.bondRegex("( 0 0 7 2 )"));
	}
	@Test
	public void testCase153 () {
	assertTrue(x.bondRegex("( 0 0 7 2 0 0 7 )"));
	}
	@Test
	public void testCase154 () {
	assertTrue(x.bondRegex("( 0 0 7 2 0 7 )"));
	}
	@Test
	public void testCase155 () {
	assertTrue(x.bondRegex("( 0 0 7 2 7 )"));
	}
	@Test
	public void testCase156 () {
	assertFalse(x.bondRegex("( 0 0 7 3 ("));
	}
	@Test
	public void testCase157 () {
	assertTrue(x.bondRegex("( 0 0 7 3 )"));
	}
	@Test
	public void testCase158 () {
	assertTrue(x.bondRegex("( 0 0 7 3 0 0 7 )"));
	}
	@Test
	public void testCase159 () {
	assertTrue(x.bondRegex("( 0 0 7 3 0 7 )"));
	}
	@Test
	public void testCase160 () {
	assertTrue(x.bondRegex("( 0 0 7 3 7 )"));
	}
	@Test
	public void testCase161 () {
	assertFalse(x.bondRegex("( 0 0 7 4 ("));
	}
	@Test
	public void testCase162 () {
	assertTrue(x.bondRegex("( 0 0 7 4 )"));
	}
	@Test
	public void testCase163 () {
	assertTrue(x.bondRegex("( 0 0 7 4 0 0 7 )"));
	}
	@Test
	public void testCase164 () {
	assertTrue(x.bondRegex("( 0 0 7 4 0 7 )"));
	}
	@Test
	public void testCase165 () {
	assertTrue(x.bondRegex("( 0 0 7 4 7 )"));
	}
	@Test
	public void testCase166 () {
	assertFalse(x.bondRegex("( 0 0 7 5 ("));
	}
	@Test
	public void testCase167 () {
	assertTrue(x.bondRegex("( 0 0 7 5 )"));
	}
	@Test
	public void testCase168 () {
	assertTrue(x.bondRegex("( 0 0 7 5 0 0 7 )"));
	}
	@Test
	public void testCase169 () {
	assertTrue(x.bondRegex("( 0 0 7 5 0 7 )"));
	}
	@Test
	public void testCase170 () {
	assertTrue(x.bondRegex("( 0 0 7 5 7 )"));
	}
	@Test
	public void testCase171 () {
	assertFalse(x.bondRegex("( 0 0 7 6 ("));
	}
	@Test
	public void testCase172 () {
	assertTrue(x.bondRegex("( 0 0 7 6 )"));
	}
	@Test
	public void testCase173 () {
	assertTrue(x.bondRegex("( 0 0 7 6 0 0 7 )"));
	}
	@Test
	public void testCase174 () {
	assertTrue(x.bondRegex("( 0 0 7 6 0 7 )"));
	}
	@Test
	public void testCase175 () {
	assertTrue(x.bondRegex("( 0 0 7 6 7 )"));
	}
	@Test
	public void testCase176 () {
	assertFalse(x.bondRegex("( 0 0 7 7 ("));
	}
	@Test
	public void testCase177 () {
	assertTrue(x.bondRegex("( 0 0 7 7 )"));
	}
	@Test
	public void testCase178 () {
	assertTrue(x.bondRegex("( 0 0 7 7 0 0 7 )"));
	}
	@Test
	public void testCase179 () {
	assertTrue(x.bondRegex("( 0 0 7 7 0 7 )"));
	}
	@Test
	public void testCase180 () {
	assertTrue(x.bondRegex("( 0 0 7 7 7 )"));
	}
	@Test
	public void testCase181 () {
	assertFalse(x.bondRegex("( 0 0 7 8 ("));
	}
	@Test
	public void testCase182 () {
	assertTrue(x.bondRegex("( 0 0 7 8 )"));
	}
	@Test
	public void testCase183 () {
	assertTrue(x.bondRegex("( 0 0 7 8 0 0 7 )"));
	}
	@Test
	public void testCase184 () {
	assertTrue(x.bondRegex("( 0 0 7 8 0 7 )"));
	}
	@Test
	public void testCase185 () {
	assertTrue(x.bondRegex("( 0 0 7 8 7 )"));
	}
	@Test
	public void testCase186 () {
	assertFalse(x.bondRegex("( 0 0 7 9 ("));
	}
	@Test
	public void testCase187 () {
	assertTrue(x.bondRegex("( 0 0 7 9 )"));
	}
	@Test
	public void testCase188 () {
	assertTrue(x.bondRegex("( 0 0 7 9 0 0 7 )"));
	}
	@Test
	public void testCase189 () {
	assertTrue(x.bondRegex("( 0 0 7 9 0 7 )"));
	}
	@Test
	public void testCase190 () {
	assertTrue(x.bondRegex("( 0 0 7 9 7 )"));
	}
	@Test
	public void testCase191 () {
	assertFalse(x.bondRegex("( 0 0 8 ("));
	}
	@Test
	public void testCase192 () {
	assertFalse(x.bondRegex("( 0 0 8 )"));
	}
	@Test
	public void testCase193 () {
	assertTrue(x.bondRegex("( 0 0 8 0 0 7 )"));
	}
	@Test
	public void testCase194 () {
	assertFalse(x.bondRegex("( 0 0 8 0 7 )"));
	}
	@Test
	public void testCase195 () {
	assertFalse(x.bondRegex("( 0 0 8 7 )"));
	}
	@Test
	public void testCase196 () {
	assertFalse(x.bondRegex("( 0 0 9 ("));
	}
	@Test
	public void testCase197 () {
	assertFalse(x.bondRegex("( 0 0 9 )"));
	}
	@Test
	public void testCase198 () {
	assertTrue(x.bondRegex("( 0 0 9 0 0 7 )"));
	}
	@Test
	public void testCase199 () {
	assertFalse(x.bondRegex("( 0 0 9 0 7 )"));
	}
	@Test
	public void testCase200 () {
	assertFalse(x.bondRegex("( 0 0 9 7 )"));
	}
	@Test
	public void testCase201 () {
	assertFalse(x.bondRegex("( 0 1 ("));
	}
	@Test
	public void testCase202 () {
	assertFalse(x.bondRegex("( 0 1 )"));
	}
	@Test
	public void testCase203 () {
	assertTrue(x.bondRegex("( 0 1 0 0 7 )"));
	}
	@Test
	public void testCase204 () {
	assertFalse(x.bondRegex("( 0 1 0 7 )"));
	}
	@Test
	public void testCase205 () {
	assertFalse(x.bondRegex("( 0 1 7 )"));
	}
	@Test
	public void testCase206 () {
	assertFalse(x.bondRegex("( 0 2 ("));
	}
	@Test
	public void testCase207 () {
	assertFalse(x.bondRegex("( 0 2 )"));
	}
	@Test
	public void testCase208 () {
	assertTrue(x.bondRegex("( 0 2 0 0 7 )"));
	}
	@Test
	public void testCase209 () {
	assertFalse(x.bondRegex("( 0 2 0 7 )"));
	}
	@Test
	public void testCase210 () {
	assertFalse(x.bondRegex("( 0 2 7 )"));
	}
	@Test
	public void testCase211 () {
	assertFalse(x.bondRegex("( 0 3 ("));
	}
	@Test
	public void testCase212 () {
	assertFalse(x.bondRegex("( 0 3 )"));
	}
	@Test
	public void testCase213 () {
	assertTrue(x.bondRegex("( 0 3 0 0 7 )"));
	}
	@Test
	public void testCase214 () {
	assertFalse(x.bondRegex("( 0 3 0 7 )"));
	}
	@Test
	public void testCase215 () {
	assertFalse(x.bondRegex("( 0 3 7 )"));
	}
	@Test
	public void testCase216 () {
	assertFalse(x.bondRegex("( 0 4 ("));
	}
	@Test
	public void testCase217 () {
	assertFalse(x.bondRegex("( 0 4 )"));
	}
	@Test
	public void testCase218 () {
	assertTrue(x.bondRegex("( 0 4 0 0 7 )"));
	}
	@Test
	public void testCase219 () {
	assertFalse(x.bondRegex("( 0 4 0 7 )"));
	}
	@Test
	public void testCase220 () {
	assertFalse(x.bondRegex("( 0 4 7 )"));
	}
	@Test
	public void testCase221 () {
	assertFalse(x.bondRegex("( 0 5 ("));
	}
	@Test
	public void testCase222 () {
	assertFalse(x.bondRegex("( 0 5 )"));
	}
	@Test
	public void testCase223 () {
	assertTrue(x.bondRegex("( 0 5 0 0 7 )"));
	}
	@Test
	public void testCase224 () {
	assertFalse(x.bondRegex("( 0 5 0 7 )"));
	}
	@Test
	public void testCase225 () {
	assertFalse(x.bondRegex("( 0 5 7 )"));
	}
	@Test
	public void testCase226 () {
	assertFalse(x.bondRegex("( 0 6 ("));
	}
	@Test
	public void testCase227 () {
	assertFalse(x.bondRegex("( 0 6 )"));
	}
	@Test
	public void testCase228 () {
	assertTrue(x.bondRegex("( 0 6 0 0 7 )"));
	}
	@Test
	public void testCase229 () {
	assertFalse(x.bondRegex("( 0 6 0 7 )"));
	}
	@Test
	public void testCase230 () {
	assertFalse(x.bondRegex("( 0 6 7 )"));
	}
	@Test
	public void testCase231 () {
	assertFalse(x.bondRegex("( 0 7 ("));
	}
	@Test
	public void testCase232 () {
	assertFalse(x.bondRegex("( 0 7 )"));
	}
	@Test
	public void testCase233 () {
	assertTrue(x.bondRegex("( 0 7 0 0 7 )"));
	}
	@Test
	public void testCase234 () {
	assertFalse(x.bondRegex("( 0 7 0 7 )"));
	}
	@Test
	public void testCase235 () {
	assertFalse(x.bondRegex("( 0 7 7 )"));
	}
	@Test
	public void testCase236 () {
	assertFalse(x.bondRegex("( 0 8 ("));
	}
	@Test
	public void testCase237 () {
	assertFalse(x.bondRegex("( 0 8 )"));
	}
	@Test
	public void testCase238 () {
	assertTrue(x.bondRegex("( 0 8 0 0 7 )"));
	}
	@Test
	public void testCase239 () {
	assertFalse(x.bondRegex("( 0 8 0 7 )"));
	}
	@Test
	public void testCase240 () {
	assertFalse(x.bondRegex("( 0 8 7 )"));
	}
	@Test
	public void testCase241 () {
	assertFalse(x.bondRegex("( 0 9 ("));
	}
	@Test
	public void testCase242 () {
	assertFalse(x.bondRegex("( 0 9 )"));
	}
	@Test
	public void testCase243 () {
	assertTrue(x.bondRegex("( 0 9 0 0 7 )"));
	}
	@Test
	public void testCase244 () {
	assertFalse(x.bondRegex("( 0 9 0 7 )"));
	}
	@Test
	public void testCase245 () {
	assertFalse(x.bondRegex("( 0 9 7 )"));
	}
	@Test
	public void testCase246 () {
	assertFalse(x.bondRegex("( 1 ("));
	}
	@Test
	public void testCase247 () {
	assertFalse(x.bondRegex("( 1 )"));
	}
	@Test
	public void testCase248 () {
	assertTrue(x.bondRegex("( 1 0 0 7 )"));
	}
	@Test
	public void testCase249 () {
	assertFalse(x.bondRegex("( 1 0 7 )"));
	}
	@Test
	public void testCase250 () {
	assertFalse(x.bondRegex("( 1 7 )"));
	}
	@Test
	public void testCase251 () {
	assertFalse(x.bondRegex("( 2 ("));
	}
	@Test
	public void testCase252 () {
	assertFalse(x.bondRegex("( 2 )"));
	}
	@Test
	public void testCase253 () {
	assertTrue(x.bondRegex("( 2 0 0 7 )"));
	}
	@Test
	public void testCase254 () {
	assertFalse(x.bondRegex("( 2 0 7 )"));
	}
	@Test
	public void testCase255 () {
	assertFalse(x.bondRegex("( 2 7 )"));
	}
	@Test
	public void testCase256 () {
	assertFalse(x.bondRegex("( 3 ("));
	}
	@Test
	public void testCase257 () {
	assertFalse(x.bondRegex("( 3 )"));
	}
	@Test
	public void testCase258 () {
	assertTrue(x.bondRegex("( 3 0 0 7 )"));
	}
	@Test
	public void testCase259 () {
	assertFalse(x.bondRegex("( 3 0 7 )"));
	}
	@Test
	public void testCase260 () {
	assertFalse(x.bondRegex("( 3 7 )"));
	}
	@Test
	public void testCase261 () {
	assertFalse(x.bondRegex("( 4 ("));
	}
	@Test
	public void testCase262 () {
	assertFalse(x.bondRegex("( 4 )"));
	}
	@Test
	public void testCase263 () {
	assertTrue(x.bondRegex("( 4 0 0 7 )"));
	}
	@Test
	public void testCase264 () {
	assertFalse(x.bondRegex("( 4 0 7 )"));
	}
	@Test
	public void testCase265 () {
	assertFalse(x.bondRegex("( 4 7 )"));
	}
	@Test
	public void testCase266 () {
	assertFalse(x.bondRegex("( 5 ("));
	}
	@Test
	public void testCase267 () {
	assertFalse(x.bondRegex("( 5 )"));
	}
	@Test
	public void testCase268 () {
	assertTrue(x.bondRegex("( 5 0 0 7 )"));
	}
	@Test
	public void testCase269 () {
	assertFalse(x.bondRegex("( 5 0 7 )"));
	}
	@Test
	public void testCase270 () {
	assertFalse(x.bondRegex("( 5 7 )"));
	}
	@Test
	public void testCase271 () {
	assertFalse(x.bondRegex("( 6 ("));
	}
	@Test
	public void testCase272 () {
	assertFalse(x.bondRegex("( 6 )"));
	}
	@Test
	public void testCase273 () {
	assertTrue(x.bondRegex("( 6 0 0 7 )"));
	}
	@Test
	public void testCase274 () {
	assertFalse(x.bondRegex("( 6 0 7 )"));
	}
	@Test
	public void testCase275 () {
	assertFalse(x.bondRegex("( 6 7 )"));
	}
	@Test
	public void testCase276 () {
	assertFalse(x.bondRegex("( 7 ("));
	}
	@Test
	public void testCase277 () {
	assertFalse(x.bondRegex("( 7 )"));
	}
	@Test
	public void testCase278 () {
	assertTrue(x.bondRegex("( 7 0 0 7 )"));
	}
	@Test
	public void testCase279 () {
	assertFalse(x.bondRegex("( 7 0 7 )"));
	}
	@Test
	public void testCase280 () {
	assertFalse(x.bondRegex("( 7 7 )"));
	}
	@Test
	public void testCase281 () {
	assertFalse(x.bondRegex("( 8 ("));
	}
	@Test
	public void testCase282 () {
	assertFalse(x.bondRegex("( 8 )"));
	}
	@Test
	public void testCase283 () {
	assertTrue(x.bondRegex("( 8 0 0 7 )"));
	}
	@Test
	public void testCase284 () {
	assertFalse(x.bondRegex("( 8 0 7 )"));
	}
	@Test
	public void testCase285 () {
	assertFalse(x.bondRegex("( 8 7 )"));
	}
	@Test
	public void testCase286 () {
	assertFalse(x.bondRegex("( 9 ("));
	}
	@Test
	public void testCase287 () {
	assertFalse(x.bondRegex("( 9 )"));
	}
	@Test
	public void testCase288 () {
	assertTrue(x.bondRegex("( 9 0 0 7 )"));
	}
	@Test
	public void testCase289 () {
	assertFalse(x.bondRegex("( 9 0 7 )"));
	}
	@Test
	public void testCase290 () {
	assertFalse(x.bondRegex("( 9 7 )"));
	}
	@Test
	public void testCase291 () {
	assertFalse(x.bondRegex(")"));
	}
	@Test
	public void testCase292 () {
	assertFalse(x.bondRegex(") ("));
	}
	@Test
	public void testCase293 () {
	assertFalse(x.bondRegex(") )"));
	}
	@Test
	public void testCase294 () {
	assertFalse(x.bondRegex(") 0 0 7 )"));
	}
	@Test
	public void testCase295 () {
	assertFalse(x.bondRegex(") 0 7 )"));
	}
	@Test
	public void testCase296 () {
	assertFalse(x.bondRegex(") 7 )"));
	}
	@Test
	public void testCase297 () {
	assertFalse(x.bondRegex("0 ("));
	}
	@Test
	public void testCase298 () {
	assertFalse(x.bondRegex("0 )"));
	}
	@Test
	public void testCase299 () {
	assertFalse(x.bondRegex("0 0 0 7 )"));
	}
	@Test
	public void testCase300 () {
	assertFalse(x.bondRegex("0 0 7 )"));
	}
	@Test
	public void testCase301 () {
	assertFalse(x.bondRegex("0 7 )"));
	}
	@Test
	public void testCase302 () {
	assertFalse(x.bondRegex("1 ("));
	}
	@Test
	public void testCase303 () {
	assertFalse(x.bondRegex("1 )"));
	}
	@Test
	public void testCase304 () {
	assertFalse(x.bondRegex("1 0 0 7 )"));
	}
	@Test
	public void testCase305 () {
	assertFalse(x.bondRegex("1 0 7 )"));
	}
	@Test
	public void testCase306 () {
	assertFalse(x.bondRegex("1 7 )"));
	}
	@Test
	public void testCase307 () {
	assertFalse(x.bondRegex("2 ("));
	}
	@Test
	public void testCase308 () {
	assertFalse(x.bondRegex("2 )"));
	}
	@Test
	public void testCase309 () {
	assertFalse(x.bondRegex("2 0 0 7 )"));
	}
	@Test
	public void testCase310 () {
	assertFalse(x.bondRegex("2 0 7 )"));
	}
	@Test
	public void testCase311 () {
	assertFalse(x.bondRegex("2 7 )"));
	}
	@Test
	public void testCase312 () {
	assertFalse(x.bondRegex("3 ("));
	}
	@Test
	public void testCase313 () {
	assertFalse(x.bondRegex("3 )"));
	}
	@Test
	public void testCase314 () {
	assertFalse(x.bondRegex("3 0 0 7 )"));
	}
	@Test
	public void testCase315 () {
	assertFalse(x.bondRegex("3 0 7 )"));
	}
	@Test
	public void testCase316 () {
	assertFalse(x.bondRegex("3 7 )"));
	}
	@Test
	public void testCase317 () {
	assertFalse(x.bondRegex("4 ("));
	}
	@Test
	public void testCase318 () {
	assertFalse(x.bondRegex("4 )"));
	}
	@Test
	public void testCase319 () {
	assertFalse(x.bondRegex("4 0 0 7 )"));
	}
	@Test
	public void testCase320 () {
	assertFalse(x.bondRegex("4 0 7 )"));
	}
	@Test
	public void testCase321 () {
	assertFalse(x.bondRegex("4 7 )"));
	}
	@Test
	public void testCase322 () {
	assertFalse(x.bondRegex("5 ("));
	}
	@Test
	public void testCase323 () {
	assertFalse(x.bondRegex("5 )"));
	}
	@Test
	public void testCase324 () {
	assertFalse(x.bondRegex("5 0 0 7 )"));
	}
	@Test
	public void testCase325 () {
	assertFalse(x.bondRegex("5 0 7 )"));
	}
	@Test
	public void testCase326 () {
	assertFalse(x.bondRegex("5 7 )"));
	}
	@Test
	public void testCase327 () {
	assertFalse(x.bondRegex("6 ("));
	}
	@Test
	public void testCase328 () {
	assertFalse(x.bondRegex("6 )"));
	}
	@Test
	public void testCase329 () {
	assertFalse(x.bondRegex("6 0 0 7 )"));
	}
	@Test
	public void testCase330 () {
	assertFalse(x.bondRegex("6 0 7 )"));
	}
	@Test
	public void testCase331 () {
	assertFalse(x.bondRegex("6 7 )"));
	}
	@Test
	public void testCase332 () {
	assertFalse(x.bondRegex("7 ("));
	}
	@Test
	public void testCase333 () {
	assertFalse(x.bondRegex("7 )"));
	}
	@Test
	public void testCase334 () {
	assertFalse(x.bondRegex("7 0 0 7 )"));
	}
	@Test
	public void testCase335 () {
	assertFalse(x.bondRegex("7 0 7 )"));
	}
	@Test
	public void testCase336 () {
	assertFalse(x.bondRegex("7 7 )"));
	}
	@Test
	public void testCase337 () {
	assertFalse(x.bondRegex("8 ("));
	}
	@Test
	public void testCase338 () {
	assertFalse(x.bondRegex("8 )"));
	}
	@Test
	public void testCase339 () {
	assertFalse(x.bondRegex("8 0 0 7 )"));
	}
	@Test
	public void testCase340 () {
	assertFalse(x.bondRegex("8 0 7 )"));
	}
	@Test
	public void testCase341 () {
	assertFalse(x.bondRegex("8 7 )"));
	}
	@Test
	public void testCase342 () {
	assertFalse(x.bondRegex("9 ("));
	}
	@Test
	public void testCase343 () {
	assertFalse(x.bondRegex("9 )"));
	}
	@Test
	public void testCase344 () {
	assertFalse(x.bondRegex("9 0 0 7 )"));
	}
	@Test
	public void testCase345 () {
	assertFalse(x.bondRegex("9 0 7 )"));
	}
	@Test
	public void testCase346 () {
	assertFalse(x.bondRegex("9 7 )"));
	}

}
