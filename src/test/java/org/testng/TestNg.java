package org.testng;

import org.testng.annotations.Test;

public class TestNg {
@Test(priority=10)
private void tc1() {
System.out.println("test1");
}
@Test (priority=-100,invocationCount=2)
private void tc2() {
System.out.println("test2");
}
@Test(priority=20,enabled=true)
private void tc3() {
System.out.println("test3");
}
}
