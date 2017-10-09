<font size = 6>
*V 1.0说明文档*
</font>

<hr>

# 依赖方式 #

在root gradle中：

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

在app gradle中：

	dependencies {
	    compile 'com.github.teaphy:ArcUtil:1.0'
	}

<hr>

# BaseActivity #

该基类Activity继承于AppCompatActivity，在OnCreate中声明了一些初始化方法：

- initData()
- initView()
- initTitle()
- setListener()

# BaseRecyclerViewActivity #

该类继承于BaseActivity，封装了RecyclerView的初始化，在实现类中需提供泛型<RecyclerView.Adapter.ViewHoder, RecyclerView.Adapter>。在onCreate中，调用了Adapter的初始化方法：

initAdapter()


示例代码如下：

	class MainActivity : BaseRecyclerViewActivity<AdapterSingleText.MyHolder, AdapterSingleText>() {
		
		***
	
	        override fun initAdapter() {
	            mAdapter = AdapterSingleText(mList, object : OnItemClickCallback {
	                override fun onClick(position: Int) {
	
	                }
	            })
	        }
	
		override fun onCreate(savedInstanceState: Bundle?) {
			super.onCreate(savedInstanceState)
		}
	}

# 回调接口(CallBack) #

## OnItemClickCallback ##

Item单击事件回调，里面定义了onClick函数，回调时需传递position参数：

	mCallBack = object: OnItemClickCallback {
		override fun onClick(position: Int) {

		}
	}

# Adapter #

## AdapterSingleText ##

只有一行居中文本的RecyclerView的Adapter,创建时需传递两个参数:

- list: MutableList<String>：文本列表
- callback: OnItemClickCallback：item单击事件处理

示例代码如下：

	mAdapter = AdapterSingleText(mList, object: OnItemClickCallback {
		override fun onClick(position: Int) {

		}
	})
