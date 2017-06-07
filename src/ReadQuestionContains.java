import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class ReadQuestionContains
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		FileReader fr165 = new FileReader("165.txt");
		BufferedReader br165 = new BufferedReader(fr165);

		FileReader fract = new FileReader("act.txt");
		BufferedReader bract = new BufferedReader(fract);

		FileReader frtarget = new FileReader("target.txt");
		BufferedReader brtarget = new BufferedReader(frtarget);

		FileReader frqw = new FileReader("qw.txt");
		BufferedReader brqw = new BufferedReader(frqw);

		FileReader frfeature = new FileReader("feature.txt");
		BufferedReader brfeature = new BufferedReader(frfeature);
		ArrayList AL165 = new ArrayList();
		ArrayList ALact = new ArrayList();
		ArrayList ALtarget = new ArrayList();
		ArrayList ALqw = new ArrayList();
		ArrayList ALfeature = new ArrayList();
		String Act = null, Target = null, QW = null, Feature = null, lines165, linesact, linestarget, linesqw,
				linesfeature;
		while ((lines165 = br165.readLine()) != null)
		{
			AL165.add(lines165);
		}
		while ((linesact = bract.readLine()) != null)
		{
			ALact.add(linesact);
		}
		while ((linestarget = brtarget.readLine()) != null)
		{
			ALtarget.add(linestarget);
		}

		while ((linesqw = brqw.readLine()) != null)
		{
			ALqw.add(linesqw);
		}

		while ((linesfeature = brfeature.readLine()) != null)
		{
			ALfeature.add(linesfeature);
		}

		for (int x = 0; x < AL165.size(); x++)
		{
			for (int y = 0; y < ALact.size(); y++)
			{
				if (AL165.get(x).toString().contains(ALact.get(y).toString()))
				{
					Act = ALact.get(y).toString();
				} 
			}

			for (int y = 0; y < ALtarget.size(); y++)
			{
				if (AL165.get(x).toString().contains(ALtarget.get(y).toString()))
				{
					Target = ALtarget.get(y).toString();
				} 
			}

			for (int y = 0; y < ALqw.size(); y++)
			{
				if (AL165.get(x).toString().contains(ALqw.get(y).toString()))
				{
					QW = ALqw.get(y).toString();
				} 
			}

			for (int y = 0; y < ALfeature.size(); y++)
			{
				if (AL165.get(x).toString().contains(ALfeature.get(y).toString()))
				{
					Feature = ALfeature.get(y).toString();
				}
			}
			System.out.println(x + AL165.get(x).toString());
			System.out.println(x + " Act: " + Act);
			System.out.println(x + " Target: " + Target);
			System.out.println(x + " QW: " + QW);
			System.out.println(x + " Feature: " + Feature);
			System.out.println("");
			
			Act="";
			Target="";
			QW="";
			Feature="";
		}
	}
}
