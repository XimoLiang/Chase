import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.corpus.dependency.CoNll.CoNLLSentence;
import com.hankcs.hanlp.corpus.dependency.CoNll.CoNLLWord;
import com.hankcs.hanlp.dependency.CRFDependencyParser;
import com.hankcs.hanlp.seg.Segment;
import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.suggest.Suggester;
import com.hankcs.hanlp.tokenizer.IndexTokenizer;
import com.hankcs.hanlp.tokenizer.NLPTokenizer;
import com.hankcs.hanlp.tokenizer.StandardTokenizer;
import com.hankcs.hanlp.tokenizer.TraditionalChineseTokenizer;

public class Hello {
	public static void main(String[] args) {
	      StandardTokenizer.SEGMENT.enableAllNamedEntityRecognize(true);
	      StandardTokenizer.SEGMENT.enableCustomDictionary(true);
	      StandardTokenizer.SEGMENT.enableJapaneseNameRecognize(true);
	      StandardTokenizer.SEGMENT.enableNameRecognize(true);
	      StandardTokenizer.SEGMENT.enableOrganizationRecognize(true);
	      StandardTokenizer.SEGMENT.enableTranslatedNameRecognize(true);
	    try {
	        FileReader fr1=new FileReader("d:/workspace/165.txt");
	      BufferedReader br1=new BufferedReader(fr1);
//	      String line1;		
//	      for (int i=1; i<=4;i++){
//      	while ((br1.readLine()) != null) {
//	    		System.out.println(HanLP.segment(br1.readLine()));
//	      		System.out.println(HanLP.parseDependency(br1.readLine()));
	    	  
//	    	  System.out.println(HanLP.parseDependency(HanLP.convertToSimplifiedChinese(br1.readLine())));
//	      		System.out.println(HanLP.convertToTraditionalChinese(HanLP.parseDependency(HanLP.convertToSimplifiedChinese(br1.readLine())).toString()));
//	    		List<Term> termList = StandardTokenizer.segment(HanLP.convertToSimplifiedChinese(br1.readLine()));
//	    		System.out.println("題" + ": " + termList);
//	    	  List<Term> termList = TraditionalChineseTokenizer.segment(br1.readLine());

//	    	  System.out.println("題" + i + ": " + termList);

	    	  String nr="";
	    	  String v="";
	    	  String t="";
	    	  String lo="";
	    	  String ob="";
	    	  String text = "新華社報導，馬雲在會中就全球電子商務發展提出新願景時說，未來不會再有「電子商務」，因為每一項商貿活動尤其是跨境貿易都會透過網路進行；未來30年，全球化和貿易仍是解決就業問題的方案。";
//	    	  List<Term> str = StandardTokenizer.segment(HanLP.convertToSimplifiedChinese(text));
	    	  List<Term> str = TraditionalChineseTokenizer.segment(text);
	    	  for (int m=0; m<str.size(); m++){
	    	  if (str.get(m).nature.toString().equals("nr")) //人名
	    	  {
	    		nr= nr+ str.get(m).word+ " ";
	    	  }
	    	  if (str.get(m).nature.toString().equals("v"))  //動作
	    	  {
	    		v= v+ str.get(m).word+ " ";
	    	  }
	    	  if (str.get(m).nature.toString().equals("t"))  //時間
	    	  {
	    		t= t+ str.get(m).word+ " ";
	    	  }
	    	  if (str.get(m).nature.toString().equals("ns"))   //地方
	    	  {
	    		lo= lo+ str.get(m).word+ " ";
	    	  }
	    	  if (str.get(m).nature.toString().equals("n"))    //目標
	    	  {
	    		ob= ob+ str.get(m).word+ " ";
	    	  }
    	  }
    	  System.out.println("人名: " + nr);
    	  System.out.println("動作: " + v);
    	  System.out.println("時間: " + t);
    	  System.out.println("地方: " + lo);
    	  System.out.println("目標: " + ob);
 
//	    	  System.out.println(str.get(0).word);
//	    	  System.out.println(str.get(0).nature);
    	  
	    	  System.out.println(TraditionalChineseTokenizer.segment(text));

//	    	  StandardTokenizer.SEGMENT.enableAllNamedEntityRecognize(true);
//	    	  System.out.println(StandardTokenizer.segment(text));
	    	  
//	    	  List<Term> termList = NLPTokenizer.segment(br1.readLine());
//	    	  System.out.println(termList);
//	    	  List<Term> termList = HanLP.segment(br1.readLine());
//	    	  System.out.println(termList);
	    	  
//	    		List<Term> termList = StandardTokenizer.segment(br1.readLine());
//	    		System.out.println("題"+i+": "+termList);
//	    		List<Term> termList = TraditionalChineseTokenizer.segment("大衛貝克漢不僅僅是名著名球員，球場以外，其妻為前辣妹合唱團成員維多利亞·碧咸，亦由於他擁有突出外表、百變髮型及正面的形象，以至自己品牌的男士香水等商品，及長期擔任運動品牌Adidas的代言人，因此對大眾傳播媒介和時尚界等方面都具很大的影響力，在足球圈外所獲得的認受程度可謂前所未見。");
//	    		System.out.println(termList);
//				List<Term> termList = IndexTokenizer.segment(br1.readLine());
//				for (Term term : termList)
//				{
	    		    //System.out.println(term + " [" + term.offset + ":" + (term.offset + term.word.length()) + "]");
	    		//}
//	    	 }
	     
	      }
	    catch (IOException e) {System.out.println(e);}

		
//		System.out.println(HanLP.parseDependency("手機上網如何設定"));
//		System.out.println(HanLP.segment("如何設定手機上網"));
//		System.out.println(HanLP.segment("手機如何設定上網"));
//		System.out.println(CRFDependencyParser.compute("把市场经济奉行的等价交换原则引入党的生活和国家机关政务活动中"));
//		System.out.println(HanLP.segment("你好，欢迎使用HanLP！"));
//		List<Term> termList = HanLP.segment("商品和服务");
//		System.out.println(termList);
//		List<Term> termList = NLPTokenizer.segment("中国科学院计算技术研究所的宗成庆教授正在教授自然语言处理课程");
//		System.out.println(termList);
//		List<Term> termList = HanLP.segment("商品和服务");
//		System.out.println(termList);
	
	}

}
