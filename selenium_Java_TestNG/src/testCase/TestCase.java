package testCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase
{
		@Test
		public static void login()
		{
			System.out.println("Amazon Login");
		}
		@BeforeSuite
		public static void bs()
		{
			System.out.println("BS");
		}
		@AfterSuite
		public static void as()
		{
			System.out.println("AS");
		}
		@BeforeTest
		public static void bt()
		{
			System.out.println("BT");
		}
		@AfterTest
		public static void at()
		{
			System.out.println("AT");
		}
		@BeforeClass
		public static void bc()
		{
			System.out.println("BC");
		}
		@AfterClass
		public static void ac()
		{
			System.out.println("AC");
		}
		@BeforeMethod
		public static void bm()
		{
			System.out.println("BM");
		}
		@AfterMethod
		public static void am()
		{
			System.out.println("AM");
		}
	}


