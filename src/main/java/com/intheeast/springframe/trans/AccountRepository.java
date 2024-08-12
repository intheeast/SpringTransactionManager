package com.intheeast.springframe.trans;

public interface AccountRepository {
    void transfer(double amount, String fromAccountId, String toAccountId);
}
