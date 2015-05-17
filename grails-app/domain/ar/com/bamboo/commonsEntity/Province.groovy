package ar.com.bamboo.commonsEntity

import ar.com.bamboo.framework.domains.BaseEntity

class Province extends BaseEntity{

    String name

    static constraints = {
        name blank: false
    }

    @Override
    protected void executeMoreBeforeInsert() {

    }
}
