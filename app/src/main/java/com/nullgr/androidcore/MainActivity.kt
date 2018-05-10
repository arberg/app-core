package com.nullgr.androidcore

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.nullgr.androidcore.adapter.AdapterExampleActivity
import com.nullgr.androidcore.adapter.AdapterExampleWithPayloadsActivity
import com.nullgr.androidcore.date.DateUtilsExampleActivity
import com.nullgr.androidcore.fonts.FontsAndSpansExampleActivity
import com.nullgr.androidcore.intents.CommonIntentsExampleActivity
import com.nullgr.androidcore.location.RxLocationManagerExampleActivity
import com.nullgr.androidcore.resources.ResourcesExampleActivity
import com.nullgr.androidcore.rxcontacts.RxContactsExampleActivity
import com.nullgr.corelibrary.intents.launch
import kotlinx.android.synthetic.main.activity_main.buttonAdapterExample
import kotlinx.android.synthetic.main.activity_main.buttonAdapterWithPayloadsExample
import kotlinx.android.synthetic.main.activity_main.buttonCommonIntentsExample
import kotlinx.android.synthetic.main.activity_main.buttonDateUtilsExample
import kotlinx.android.synthetic.main.activity_main.buttonFontsAndSpans
import kotlinx.android.synthetic.main.activity_main.buttonLocationExample
import kotlinx.android.synthetic.main.activity_main.buttonResourcesExample
import kotlinx.android.synthetic.main.activity_main.buttonRxContactsProviderExample

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonLocationExample.setOnClickListener {
            Intent(this@MainActivity, RxLocationManagerExampleActivity::class.java)
                    .launch(this)
        }

        buttonCommonIntentsExample.setOnClickListener {
            Intent(this, CommonIntentsExampleActivity::class.java)
                    .launch(this)
        }

        buttonFontsAndSpans.setOnClickListener {
            Intent(this, FontsAndSpansExampleActivity::class.java)
                    .launch(this)
        }

        buttonDateUtilsExample.setOnClickListener {
            Intent(this, DateUtilsExampleActivity::class.java).launch(this)
        }

        buttonResourcesExample.setOnClickListener {
            Intent(this, ResourcesExampleActivity::class.java).launch(this)
        }

        buttonAdapterExample.setOnClickListener {
            Intent(this, AdapterExampleActivity::class.java).launch(this)
        }

        buttonAdapterWithPayloadsExample.setOnClickListener {
            Intent(this, AdapterExampleWithPayloadsActivity::class.java).launch(this)
        }

        buttonRxContactsProviderExample.setOnClickListener {
            Intent(this, RxContactsExampleActivity::class.java).launch(this)
        }
    }
}
