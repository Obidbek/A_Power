package com.my.power;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class MainActivity extends AppCompatActivity {
	
	private LinearLayout linear3;
	private LinearLayout linear1;
	private LinearLayout linear2;
	private TextView textview1;
	private TextView textview2;
	private TextView textview3;
	private TextView textview4;
	private Button button1;
	
	private Intent i = new Intent();
	private SharedPreferences ab;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		button1 = (Button) findViewById(R.id.button1);
		ab = getSharedPreferences("ab", Activity.MODE_PRIVATE);
		
		button1.setOnLongClickListener(new View.OnLongClickListener() {
			 @Override
				public boolean onLongClick(View _view) {
				
				return true;
				}
			 });
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), BirActivity.class);
				startActivity(i);
				finishAffinity();
			}
		});
	}
	
	private void initializeLogic() {
		button1.setVisibility(View.GONE);
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
		final
		
		androidx.viewpager.widget.ViewPager viewPager = new androidx.viewpager.widget.ViewPager(this);
		viewPager.setLayoutParams(new ViewGroup.LayoutParams( ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
		viewPager.setBackgroundColor(Color.parseColor("#03a9f4")); 
		MyPagerAdapter adapter = new MyPagerAdapter();
		viewPager.setAdapter(adapter);
		viewPager.setCurrentItem(0);
		linear1.addView(viewPager);
		viewPager.addOnPageChangeListener(new androidx.viewpager.widget.ViewPager.OnPageChangeListener() { public void onPageSelected(int position) { 
				View noview = (View) viewPager.findViewWithTag("myview" + viewPager.getCurrentItem());
				if (position == 0) {
					_a();
				}
				if (position == 1) {
					_b
					();
				}
				if (position == 2) {
					_c();
				}
				if (position == 3) {
					_d();
				}
			}
			@Override public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) { }
			@Override public void onPageScrollStateChanged(int state) { }
		});
	}
	private class MyPagerAdapter extends androidx.viewpager.widget.PagerAdapter {
		public int getCount() {
			return 4;
		}
		public Object instantiateItem(View collection, int position) {
			LayoutInflater inflater = (LayoutInflater) collection.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			int resId = 0;
			switch (position) {
				case 0:
				resId = R.layout.kiri;
				break;
				case 1:
				resId = R.layout.kiri2;
				break;
				case 2:
				resId = R.layout.kanan;
				break;
				case 3:
				resId = R.layout.kanan2;
				break;
			}
			View view = inflater.inflate(resId, null);
			((androidx.viewpager.widget.ViewPager)collection).addView(view, 0);
			view.setTag("myview" + position);
			return view;
		}
		@Override
		public void destroyItem(View arg0, int arg1, Object arg2) {
			((androidx.viewpager.widget.ViewPager) arg0).removeView((View) arg2);
		}
		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			return arg0 == ((View) arg1);
		}
		@Override
		public Parcelable saveState() {
			return null;
		}
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _a () {
		button1.setVisibility(View.GONE);
		textview1.setTextColor(0xFF4CAF50);
		textview2.setTextColor(0xFF546E7A);
		textview3.setTextColor(0xFF546E7A);
		textview4.setTextColor(0xFF546E7A);
	}
	
	
	public void _b () {
		button1.setVisibility(View.GONE);
		textview1.setTextColor(0xFF546E7A);
		textview2.setTextColor(0xFF4CAF50);
		textview3.setTextColor(0xFF546E7A);
		textview4.setTextColor(0xFF546E7A);
	}
	
	
	public void _c () {
		button1.setVisibility(View.GONE);
		textview1.setTextColor(0xFF546E7A);
		textview2.setTextColor(0xFF546E7A);
		textview3.setTextColor(0xFF4CAF50);
		textview4.setTextColor(0xFF546E7A);
	}
	
	
	public void _d () {
		button1.setVisibility(View.VISIBLE);
		textview1.setTextColor(0xFF546E7A);
		textview2.setTextColor(0xFF546E7A);
		textview3.setTextColor(0xFF546E7A);
		textview4.setTextColor(0xFF4CAF50);
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}