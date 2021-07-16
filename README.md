# ProxRate

## Getting started

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

```
	dependencies {
	      	implementation 'com.github.XuanDoQuy:ProxRate:1.0.0'
	}
```

```
    	compileOptions {
        	sourceCompatibility JavaVersion.VERSION_1_8
        	targetCompatibility JavaVersion.VERSION_1_8
    	}
```

## Usage

```
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val config = ProxRateDialog.Config()
        
        config.setListener(object : RatingDialogListener{
            override fun onChangeStar(rate: Int) {

            }

            override fun onSubmitButtonClicked(rate: Int, comment: String?) {

            }

            override fun onLaterButtonClicked() {

            }
        })

        ProxRateDialog.init(this, config)

        txt.setOnClickListener {
            // ProxRateDialog.showAlways(supportFragmentManager)
            ProxRateDialog.showIfNeed(supportFragmentManager)
        }
    } 
```
