package com.zhzhg.androidfindid.innerclass;

import java.lang.reflect.Field;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ViewSwitcher;


public class ViewControl {

	private static View Current_View;

	private static ViewControl _instance;

	public static ViewControl getInstance(View view) {
		Current_View = view;
		if (_instance == null) {
			_instance = new ViewControl();
		}
		return _instance;
	}

	/**
	 * ����ͼ
	 * 
	 * @param obj
	 */
	public Object ViewBox(Object obj) {

		Field[] fileds = obj.getClass().getDeclaredFields();
		for (Field f : fileds) {
			f.setAccessible(true);
			try {
				View retView = Current_View.findViewById(Current_View
						.getResources().getIdentifier(f.getName(), "id",
								Current_View.getContext().getPackageName()));
				if (f.getType() == EditText.class) {
					f.set(obj, (EditText) retView);
				} else if (f.getType() == TextView.class) {
					f.set(obj, (TextView) retView); // MarqueeTextView
				} else if (f.getType() == ImageView.class) {
					f.set(obj, (ImageView) retView);
				} else if (f.getType() == Button.class) {
					f.set(obj, (Button) retView);
				} else if (f.getType() == RelativeLayout.class) {
					f.set(obj, (RelativeLayout) retView);
				} else if (f.getType() == LinearLayout.class) {
					f.set(obj, (LinearLayout) retView);
				} else if (f.getType() == FrameLayout.class) {
					f.set(obj, (FrameLayout) retView);
				} else if (f.getType() == ListView.class) {
					f.set(obj, (ListView) retView);
				} else if (f.getType() == GridView.class) {
					f.set(obj, (GridView) retView);
				} else if (f.getType() == CheckBox.class) {
					f.set(obj, (CheckBox) retView);
				} else if (f.getType() == Spinner.class) {
					f.set(obj, (Spinner) retView);
				} else if (f.getType() == WebView.class) {
					f.set(obj, (WebView) retView);
				} else if (f.getType() == ScrollView.class) {
					f.set(obj, (ScrollView) retView);
				} else if (f.getType() == ImageButton.class) {
					f.set(obj, (ImageButton) retView);
				} else if (f.getType() == ProgressBar.class) {
					f.set(obj, (ProgressBar) retView);
				} else if (f.getType() == ViewPager.class) {
					f.set(obj, (ViewPager) retView);
				} else if (f.getType() == RadioButton.class) {
					f.set(obj, (RadioButton) retView);
				} else if (f.getType() == RadioGroup.class) {
					f.set(obj, (RadioGroup) retView);
				}  else if (f.getType() == ViewSwitcher.class) {
					f.set(obj, (ViewSwitcher) retView);
				} else if (f.getType() == View.class) {
					f.set(obj, (View) retView);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		return obj;
	}
}
