package com.funnyfacemaker;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class Gridclass extends Activity
{
  
  GridView modelgrid;
  public int[] thumbids;

  public Gridclass()
  {
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = 0;
    arrayOfInt[1] = 1;
    thumbids = arrayOfInt;
  }

  protected void onCreate(Bundle paramBundle)
  {
    requestWindowFeature(1);
    super.onCreate(paramBundle);
    setContentView(R.layout.gridview);
  }

  public class Modeladpter extends BaseAdapter
  {
    private Context ctx;

    public Modeladpter(Context arg2)
    {
      ctx = arg2;
    }

    public int getCount()
    {
      return thumbids.length;
    }

    public Object getItem(int paramInt)
    {
      return Integer.valueOf(thumbids[paramInt]);
    }

    public long getItemId(int paramInt)
    {
      return paramInt;
    }

    @SuppressWarnings("unused")
	public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      LayoutInflater localLayoutInflater = (LayoutInflater)ctx.getSystemService("layout_inflater");
      if (paramView == null);
      for (View localView = localLayoutInflater.inflate(R.layout.row, null); ;localView = paramView )
      {
    	  localView = paramView;
        ImageView localImageView = (ImageView)paramView.findViewById(R.id.imagerow);
        localImageView.setImageResource(thumbids[paramInt]);
        //localImageView.setBackgroundResource(R.drawable.border);
        return localView;
      }
    }
  }
}
