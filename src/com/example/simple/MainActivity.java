package com.example.simple;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.view.Menu;

import java.io.File;

import java.util.List;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;



public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Create a Example object
        ParserClass parserClass = new ParserClass();
        
        // Create a file to save to and make sure to use the path provided from
        File xmlFile = new File(Environment.getExternalStorageDirectory()+ "/Simple.bpmn20.xml");
        
		// Deserialize the bpmn20.xml file
		if (xmlFile.exists())
		{
			try
		    {
				Serializer serializer = new Persister();
		        parserClass = serializer.read(ParserClass.class, xmlFile);
		    }
		    catch (Exception e)
		    {
		    	e.printStackTrace();
		    }
			
			Process process = parserClass.GetProcess();
			
			List<Object> list = process.getList();
			StartEvent startEvent = process.getStartEvent();
		 }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}


