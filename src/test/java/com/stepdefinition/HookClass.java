package com.stepdefinition;

import com.pages.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends BaseClass {
@Before(order=1)
public void before() {
System.out.println("before");
}
@Before(order=2,value="@reg")
public void before1() {
System.out.println("before1");
}

@After(order=2)
public void after() {
System.out.println("after");
}
@After(order=1)
public void after1() {
System.out.println("after1");
}

}
