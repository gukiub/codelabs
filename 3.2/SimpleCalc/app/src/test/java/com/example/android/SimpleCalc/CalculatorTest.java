/*
 * Copyright 2018, Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.SimpleCalc;

import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * JUnit4 unit tests for the calculator logic. These are local unit tests; no device needed
 */
@RunWith(JUnit4.class)
@SmallTest
public class CalculatorTest {

    private Calculator mCalculator;

    /**
     * Set up the environment for testing
     */
    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    /**
     * Test for simple addition
     */
    @Test
    public void addTwoNumbers() {
        double resultAdd = mCalculator.add(1d, 1d);
        assertThat(resultAdd, is(equalTo(2d)));
    }

    @Test
    public void addTwoNumbersNegative() {
        double resultAdd = mCalculator.add(-1d, 2d);
        assertThat(resultAdd, is(equalTo(1d)));
    }

    @Test
    public void addTwoNumbersFloats() {
        double resultAdd = mCalculator.add(1.111f, 1.111d);
        assertThat(resultAdd, is(closeTo(2.222d, 0.01)));
    }

    @Test
    public void powTwoPositiveIntegerOperands(){
        double resultPow = mCalculator.pow(5, 4);
        assertThat(resultPow, is(equalTo(625.00)));
    }

    @Test
    public void powOneNegativeOperandAsFirstNumber(){
        double resultPow = mCalculator.pow(-2, 4);
        assertThat(resultPow, is(equalTo(16.0)));
    }

    @Test
    public void powOneNegativeOperandAsSecondNumber(){
        double resultPow = mCalculator.pow(2, -4);
        assertThat(resultPow, is(equalTo(0.0625)));
    }

    @Test
    public void powZeroOperandAsFirstNumber(){
        double resultPow = mCalculator.pow(0, 4);
        assertThat(resultPow, is(equalTo(0.0)));
    }

    @Test
    public void powZeroAsTheSecondNumber(){
        double resultPow = mCalculator.pow(2, 0);
        assertThat(resultPow, is(equalTo(1.0)));
    }

    @Test
    public void powOneNegativeOperandAsSecond(){
        double resultPow = mCalculator.pow(0, -1);
        assertThat(resultPow, is(equalTo(Double.POSITIVE_INFINITY)));
    }

    @Test
    public void powNegativeZeroAndAnotherNegativeNumber(){
        double resultPow = mCalculator.pow(-0, -4);
        assertThat(resultPow, is(equalTo(Double.POSITIVE_INFINITY)));
    }
}