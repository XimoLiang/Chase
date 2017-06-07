import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.tokenizer.TraditionalChineseTokenizer;

public class ReadQuestions {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("165.txt");
		BufferedReader br=new BufferedReader(fr);
		for (int i=1; i<=165; i++){
		//while (br.ready()){
		//	System.out.println(i+" "+br.readLine());
		//	System.out.println(i+" "+HanLP.segment(br.readLine()));  //
		//	System.out.println(i+" "+NLPTokenizer.segment(br.readLine()));

	//标准分词是最常用的分词器，基于HMM-Viterbi实现，开启了中国人名识别和音译人名识别，调用方法如下:		
	//标准分词		List<Term> termList = StandardTokenizer.segment("商品和服务");
	//标准分词		System.out.println(termList);

			//NLP分词 NLPTokenizer 会执行全部命名实体识别和词性标注。，调用方法如下:		
	//NLP分词		List<Term> termList = NLPTokenizer.segment("中国科学院计算技术研究所的宗成庆教授正在教授自然语言处理课程");
	//NLP分词		System.out.println(termList);

			//索引分词 IndexTokenizer 是面向搜索引擎的分词器，能够对长词全切分，另外通过 term.offset 可以获取单词在文本中的偏移量。调用方法如下:
	//List<Term> termList = IndexTokenizer.segment("主副食品");
	//		for (Term term : termList)
	//		{
	//		    System.out.println(term + " [" + term.offset + ":" + (term.offset + term.word.length()) + "]");
	//		}
			
	//繁体分词 TraditionalChineseTokenizer 可以直接对繁体进行分词，输出切分后的繁体词语。调用方法如下:		
	//		List<Term> termList = TraditionalChineseTokenizer.segment("大衛貝克漢不僅僅是名著名球員，球場以外，其妻為前辣妹合唱團成員維多利亞·碧咸，亦由於他擁有突出外表、百變髮型及正面的形象，以至自己品牌的男士香水等商品，及長期擔任運動品牌Adidas的代言人，因此對大眾傳播媒介和時尚界等方面都具很大的影響力，在足球圈外所獲得的認受程度可謂前所未見。");
	//		System.out.println(termList);
			List<Term> termList = TraditionalChineseTokenizer.segment(br.readLine());
			System.out.println(termList);	
			
		}
	}

}
