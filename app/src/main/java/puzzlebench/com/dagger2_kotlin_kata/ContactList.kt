package puzzlebench.com.dagger2_kotlin_kata

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_contact_list.*
import puzzlebench.com.dagger2_kotlin_kata.model.Contact

class ContactList : AppCompatActivity() {

    var contact = Contact()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_list)
        contact_name_text_view.text = contact.contactName
    }
}
