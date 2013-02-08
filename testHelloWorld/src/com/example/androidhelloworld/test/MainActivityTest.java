package com.example.androidhelloworld.test;

import com.example.androidhelloworld.MainActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

		private MainActivity activity;
		private TextView view;
		private Object resourceString;
		@SuppressWarnings("deprecation")
		public MainActivityTest() {
		super("com.example.androidhelloworld", MainActivity.class);
		// TODO Auto-generated constructor stub
	}
@Override
		protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		activity = getActivity();

		view = (TextView) activity.findViewById(com.example.androidhelloworld.R.id.textView);

		resourceString = activity.getString(com.example.androidhelloworld.R.string.hello_world);
		}
		public void testText() throws Exception {

			assertNotNull(view.getText().toString(), resourceString);

		}
}
