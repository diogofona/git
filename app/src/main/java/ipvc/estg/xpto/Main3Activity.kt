package ipvc.estg.xpto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import ipvc.estg.xpto.adapter.LineAdapter
import ipvc.estg.xpto.dataclasses.Place
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    private lateinit var mylist: ArrayList<Place>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        mylist = ArrayList<Place>()

        // vira por exemplo de WS
        for (i in 0 until 500){
            mylist.add(Place("Country $i", i*500, "Capital $i"))
        }
        recycler_view.adapter = LineAdapter(mylist)
        recycler_view.layoutManager = LinearLayoutManager(this)
    }

    fun insert(view: View) {
        // nao funcional ainda
        // ready tst2
    }
}
