package com.intheeast.springframe.trans;

public class TransferServiceImpl implements TransferService {

	private AccountRepository accountRepository;

    public TransferServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void transfer(double amount, String fromAccountId, String toAccountId) {
        accountRepository.transfer(amount, fromAccountId, toAccountId);
    }
}
