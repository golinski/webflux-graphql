package com.yg.gqlwfdl.resolvers

import com.coxautodev.graphql.tools.GraphQLResolver
import com.yg.gqlwfdl.services.Company
import com.yg.gqlwfdl.services.Customer
import graphql.schema.DataFetchingEnvironment
import java.util.concurrent.CompletableFuture

class CustomerResolver : DataLoadingResolver(), GraphQLResolver<Customer> {

    fun company(customer: Customer, env: DataFetchingEnvironment): CompletableFuture<Company> =
            env.dataLoader<Long, Company>("Company", true).load(customer.companyId)
}