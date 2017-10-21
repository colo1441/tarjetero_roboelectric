/*
 * Copyright (c) 2017. Truiton (http://www.truiton.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 * Mohit Gupt (https://github.com/mohitgupt)
 *
 */

package com.macode.tarjetero.model;

public class CreditCard {
    private String name;
    private String bank;
    private String number;
    private String caducity;
    private int balance;

    public CreditCard(String name, String bank, String number, String caducity, int balance){
        this.name = name;
        this.bank = bank;
        this.number = number;
        this.balance = balance;
        this.caducity = caducity;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getNumber() {
        return this.number;
    }

    public String getBank() {
        return this.bank;
    }

    public void setBank(String newBank) {
        this.bank = newBank;
    }


    public String getCaducity() {
        return this.caducity;
    }

    public void setCaducity(String newCaducity) {
        this.caducity = newCaducity;
    }

    public void setNumber(String newNumber) {
        this.number = newNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }
}
