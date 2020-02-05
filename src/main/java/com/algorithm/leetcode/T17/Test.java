package com.algorithm.leetcode.T17;

import org.junit.Assert;
import org.junit.Before;

import java.util.*;

/**
 * @description: 17.电话号码的字母组合
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 * @time: 2020/2/5 18:23
 */

public class Test {


    private List<String> expectedCombines1;

    private List<String> expectedCombines2;

    private List<String> expectedCombines3;

    private List<String> expectedCombines4;


    @Before
    public void before(){
        //<============预期结果集==================>
        expectedCombines1=Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        expectedCombines2=Arrays.asList("adj","adk","adl","aej","aek","ael","afj","afk","afl","bdj","bdk","bdl","bej","bek","bel","bfj","bfk","bfl","cdj","cdk","cdl","cej","cek","cel","cfj","cfk","cfl");
        expectedCombines3=Arrays.asList("adgjp","adgjq","adgjr","adgjs","adgkp","adgkq","adgkr","adgks","adglp","adglq","adglr","adgls","adhjp","adhjq","adhjr","adhjs","adhkp","adhkq","adhkr","adhks","adhlp","adhlq","adhlr","adhls","adijp","adijq","adijr","adijs","adikp","adikq","adikr","adiks","adilp","adilq","adilr","adils","aegjp","aegjq","aegjr","aegjs","aegkp","aegkq","aegkr","aegks","aeglp","aeglq","aeglr","aegls","aehjp","aehjq","aehjr","aehjs","aehkp","aehkq","aehkr","aehks","aehlp","aehlq","aehlr","aehls","aeijp","aeijq","aeijr","aeijs","aeikp","aeikq","aeikr","aeiks","aeilp","aeilq","aeilr","aeils","afgjp","afgjq","afgjr","afgjs","afgkp","afgkq","afgkr","afgks","afglp","afglq","afglr","afgls","afhjp","afhjq","afhjr","afhjs","afhkp","afhkq","afhkr","afhks","afhlp","afhlq","afhlr","afhls","afijp","afijq","afijr","afijs","afikp","afikq","afikr","afiks","afilp","afilq","afilr","afils","bdgjp","bdgjq","bdgjr","bdgjs","bdgkp","bdgkq","bdgkr","bdgks","bdglp","bdglq","bdglr","bdgls","bdhjp","bdhjq","bdhjr","bdhjs","bdhkp","bdhkq","bdhkr","bdhks","bdhlp","bdhlq","bdhlr","bdhls","bdijp","bdijq","bdijr","bdijs","bdikp","bdikq","bdikr","bdiks","bdilp","bdilq","bdilr","bdils","begjp","begjq","begjr","begjs","begkp","begkq","begkr","begks","beglp","beglq","beglr","begls","behjp","behjq","behjr","behjs","behkp","behkq","behkr","behks","behlp","behlq","behlr","behls","beijp","beijq","beijr","beijs","beikp","beikq","beikr","beiks","beilp","beilq","beilr","beils","bfgjp","bfgjq","bfgjr","bfgjs","bfgkp","bfgkq","bfgkr","bfgks","bfglp","bfglq","bfglr","bfgls","bfhjp","bfhjq","bfhjr","bfhjs","bfhkp","bfhkq","bfhkr","bfhks","bfhlp","bfhlq","bfhlr","bfhls","bfijp","bfijq","bfijr","bfijs","bfikp","bfikq","bfikr","bfiks","bfilp","bfilq","bfilr","bfils","cdgjp","cdgjq","cdgjr","cdgjs","cdgkp","cdgkq","cdgkr","cdgks","cdglp","cdglq","cdglr","cdgls","cdhjp","cdhjq","cdhjr","cdhjs","cdhkp","cdhkq","cdhkr","cdhks","cdhlp","cdhlq","cdhlr","cdhls","cdijp","cdijq","cdijr","cdijs","cdikp","cdikq","cdikr","cdiks","cdilp","cdilq","cdilr","cdils","cegjp","cegjq","cegjr","cegjs","cegkp","cegkq","cegkr","cegks","ceglp","ceglq","ceglr","cegls","cehjp","cehjq","cehjr","cehjs","cehkp","cehkq","cehkr","cehks","cehlp","cehlq","cehlr","cehls","ceijp","ceijq","ceijr","ceijs","ceikp","ceikq","ceikr","ceiks","ceilp","ceilq","ceilr","ceils","cfgjp","cfgjq","cfgjr","cfgjs","cfgkp","cfgkq","cfgkr","cfgks","cfglp","cfglq","cfglr","cfgls","cfhjp","cfhjq","cfhjr","cfhjs","cfhkp","cfhkq","cfhkr","cfhks","cfhlp","cfhlq","cfhlr","cfhls","cfijp","cfijq","cfijr","cfijs","cfikp","cfikq","cfikr","cfiks","cfilp","cfilq","cfilr","cfils");
        expectedCombines4=Arrays.asList();
    }

    @org.junit.Test
    public void test(){
        Main main=new Main();

        List<String> combines1=main.letterCombinations("23");

        Assert.assertEquals(expectedCombines1,combines1);

        List<String> combines2=main.letterCombinations("235");

        Assert.assertEquals(expectedCombines2,combines2);

        List<String> combines3=main.letterCombinations("23457");

        Assert.assertEquals(expectedCombines3,combines3);

        List<String> combines4=main.letterCombinations("");

        Assert.assertEquals(expectedCombines4,combines4);


    }

}
