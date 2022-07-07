package edu.pdx.cs410J.TeamLucky13;

import org.junit.jupiter.api.Test;

import static edu.pdx.cs410J.TeamLucky13.Kata.compute;
import static org.hamcrest.CoreMatchers.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class KataTest
{
  @Test
  void canPrintOutNumber() {
    assertThat(compute("1"), equalTo("1"));
  }

  @Test
  void invalidNumberString() {
    assertThrows(NumberFormatException.class, () -> compute("hello"));
  }

  @Test
  void emptyString() {
    assertThrows(NumberFormatException.class, () -> compute(""));
  }

  @Test
  void canPrintOutFoo() {
    assertThat(compute("3"), equalTo("FooFoo"));
  }

  @Test
  void canPrintOutBar() {
    assertThat(compute("5"), equalTo("BarBar"));
  }

  @Test
  void canPrintOutQix() {
    assertThat(compute("7"), equalTo("QixQix"));
  }

  @Test
  void canPrintForNumberWithTwoDigits() {
    assertThat(compute("21"), equalTo("FooQix"));
  }

  @Test
  void divisibleByTwoNumbersAndContainsOne() {
    assertThat(compute("15"), equalTo("FooBarBar"));
  }

  @Test
  void replaceZeros() {
    assertThat(compute("101"), equalTo("1*1"));
  }

  @Test
  void replaceZerosMoreDigits() {
    assertThat(compute("10101"), equalTo("FooQix**"));
  }
}
