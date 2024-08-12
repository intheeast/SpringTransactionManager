package com.intheeast.springframe.trans;

public interface TransferService {
    void transfer(double amount, String fromAccountId, String toAccountId);
}
