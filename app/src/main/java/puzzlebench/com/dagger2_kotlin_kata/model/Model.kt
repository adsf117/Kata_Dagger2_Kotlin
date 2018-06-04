package puzzlebench.com.dagger2_kotlin_kata.model

import javax.inject.Inject

class Contact @Inject constructor() {
    val contactName = "Some Contact Name using Dagger 2"
}