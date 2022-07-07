package edu.pdx.cs410J.TeamLucky13;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;

import static org.hamcrest.MatcherAssert.assertThat;

public class KataTest
{

  @Test
  void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  void canPrintOutNumber() {
    String result = Kata.compute("1");
    assertThat(result, equalTo("1"));
  }

  @Test
  void canPrintOutFoo() {
    assertThat(Kata.compute("3"), equalTo("Foo"));
  }

  @Test
  void canPrintOutBar() {
    assertThat(Kata.compute("5"), equalTo("Bar"));
  }

  @Test
  void canPrintOutQix() {
    assertThat(Kata.compute("7"), equalTo("Qix"));
  }

  @Test
  void canPrintForNumberWithTwoDigits() {
    assertThat(Kata.compute("21"), equalTo("FooQix"));
  }

  @Test
  void divisibleByTwoNumbersAndContainsOne() {
    assertThat(Kata.compute("15"), equalTo("FooBarBar"));
  }
}
