package ibrahim.aytimur.autocompletetextview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var sehirListesi=resources.getStringArray(R.array.sehirler)
        var adapter = ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,sehirListesi)
        actv.setAdapter(adapter)
        actv.threshold=1
    }
}
