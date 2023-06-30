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
import android.widget.ImageView;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.FirebaseTooManyRequestsException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.concurrent.TimeUnit;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class RoyxatActivity extends AppCompatActivity {
	
	private double a = 0;
	
	private LinearLayout linear1;
	private LinearLayout linear9;
	private LinearLayout linear8;
	private ImageView imageview1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private Button button1;
	private ImageView imageview2;
	private EditText edittext1;
	private ImageView imageview3;
	private EditText edittext2;
	private ImageView imageview4;
	private EditText edittext3;
	private ImageView imageview5;
	private LinearLayout linear5;
	private Button button2;
	private EditText edittext4;
	
	private PhoneAuthProvider.OnVerificationStateChangedCallbacks apower;
	private PhoneAuthProvider.ForceResendingToken apower_resendToken;
	private PhoneAuthProvider.OnVerificationStateChangedCallbacks phone;
	private PhoneAuthProvider.ForceResendingToken phone_resendToken;
	private AlertDialog.Builder d;
	private Intent i = new Intent();
	private SharedPreferences aa;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.royxat);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		button1 = (Button) findViewById(R.id.button1);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		edittext3 = (EditText) findViewById(R.id.edittext3);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		button2 = (Button) findViewById(R.id.button2);
		edittext4 = (EditText) findViewById(R.id.edittext4);
		d = new AlertDialog.Builder(this);
		aa = getSharedPreferences("aa", Activity.MODE_PRIVATE);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				aa.edit().putString("ism", edittext2.getText().toString()).commit();
				aa.edit().putString("telefon", edittext1.getText().toString()).commit();
				aa.edit().putString("parol", edittext3.getText().toString()).commit();
				a = 4432;
				linear9.setVisibility(View.GONE);
				linear8.setVisibility(View.VISIBLE);
				d.setTitle("tasdiqlash kodi");
				d.setMessage("4432");
				d.create().show();
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (a == 4432) {
					d.setMessage("Tasdiqlandi");
					d.create().show();
					i.setClass(getApplicationContext(), BirActivity.class);
					startActivity(i);
					finish();
				}
				else {
					d.setTitle("Kod xato kiritildi!");
					d.setMessage("iltimos kodni qaytadan kiriting!");
					d.create().show();
					linear8.setVisibility(View.GONE);
					linear9.setVisibility(View.VISIBLE);
				}
			}
		});
	}
	
	private void initializeLogic() {
		linear8.setVisibility(View.GONE);
		button1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF4CAF50));
		linear2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF00ACC1));
		linear3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF00ACC1));
		linear4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF00ACC1));
		linear5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF00ACC1));
		button2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)35, 0xFF4CAF50));
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		switch (_requestCode) {
			
			default:
			break;
		}
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