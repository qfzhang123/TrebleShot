package com.genonbeta.TrebleShot.widget;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.view.LayoutInflater;
import android.widget.ListAdapter;

import java.util.ArrayList;

/**
 * Created by: veli
 * Date: 12/4/16 11:54 PM
 */

abstract public class ListViewAdapter<T>
		extends android.widget.BaseAdapter
		implements ListAdapterImpl<T>
{
	public Context mContext;
	private LayoutInflater mInflater;

	public ListViewAdapter(Context context)
	{
		mContext = context;
		mInflater = LayoutInflater.from(context);
	}

	@Override
	public void onDataSetChanged()
	{
		notifyDataSetChanged();
	}

	public Context getContext()
	{
		return mContext;
	}

	public LayoutInflater getInflater()
	{
		return mInflater;
	}
}
