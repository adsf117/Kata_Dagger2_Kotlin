package puzzlebench.com.dagger2_kotlin_kata

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.Component
import kotlinx.android.synthetic.main.activity_contact_list.*
import puzzlebench.com.dagger2_kotlin_kata.model.Contact
import javax.inject.Inject

class ContactListActivity : AppCompatActivity() {

    @Inject lateinit var contact: Contact

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_list)
        DaggerContactMagicBox.create().inject(this)
        contact_name_text_view.text = contact.contactName
    }
}

@Component
interface ContactMagicBox {
    fun inject(app: ContactListActivity)
}