package com.kaisle.dota2.Wrapper;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;



@RunWith(Categories.class)
@IncludeCategory(FastTests.class)
@SuiteClasses({MatchRetrieverTest.class, LeagueRetrieverTest.class, AssetsTest.class})
public class FastTestSuite {
	
}
