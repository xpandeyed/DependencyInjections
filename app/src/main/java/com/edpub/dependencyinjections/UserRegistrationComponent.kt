package com.edpub.dependencyinjections

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun injectorFun(mainActivity: MainActivity) // consumer is passed to injector function
}