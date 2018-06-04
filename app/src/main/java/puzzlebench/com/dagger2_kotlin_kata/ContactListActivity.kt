package puzzlebench.com.dagger2_kotlin_kata

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.Component
import kotlinx.android.synthetic.main.activity_contact_list.*
import puzzlebench.com.dagger2_kotlin_kata.di.ContactSurce
import puzzlebench.com.dagger2_kotlin_kata.di.SERVER1
import puzzlebench.com.dagger2_kotlin_kata.di.SERVER2
import puzzlebench.com.dagger2_kotlin_kata.di.ServerVersionToUse
import puzzlebench.com.dagger2_kotlin_kata.model.Contact
import javax.inject.Inject

class ContactListActivity : AppCompatActivity() {

    @Inject
    @field:ServerVersionToUse(SERVER1)
    lateinit var contactFromServer1: Contact
    @Inject
    @field:ServerVersionToUse(SERVER2)
    lateinit var contatcFromServer2: Contact


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_list)
        DaggerContactMagicBox.create().inject(this)
        contact_name_server1_text_view.text = contactFromServer1.contactName
        contact_name_server2_text_view.text = contatcFromServer2.contactName
    }
}

@Component(modules = [ContactSurce::class])
interface ContactMagicBox {
    fun inject(app: ContactListActivity)
}