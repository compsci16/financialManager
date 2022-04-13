package com.example.finman.model.doa.sqlviews.accountWithType;

import java.util.List;

public interface AccountWithTypeDAO {
    List<AccountWithType> getAllAccountsWithType();
    public List<AccountWithType> getAllAccountsOfSpecificType(String type);
}
