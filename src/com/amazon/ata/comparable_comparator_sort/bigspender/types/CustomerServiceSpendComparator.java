package com.amazon.ata.comparable_comparator_sort.bigspender.types;

import java.util.Comparator;

public class CustomerServiceSpendComparator implements Comparator<CustomerServiceSpend> {
    @Override
    public int compare(CustomerServiceSpend cs1, CustomerServiceSpend cs2) {
        if (cs1.equals(cs2)) {
            return 0;
        } else {
            if (cs1.getServiceSpend().getSpend() != cs2.getServiceSpend().getSpend()) {
                return (int) (cs1.getServiceSpend().getSpend() - cs2.getServiceSpend().getSpend());
            } else {
                return cs1.getServiceSpend().getServiceName().compareTo(cs2.getServiceSpend().getServiceName());
            }

        }

    }
}
