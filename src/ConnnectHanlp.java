import java.util.List;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.Segment;
import com.hankcs.hanlp.seg.common.Term;

public class ConnnectHanlp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(HanLP.segment("你好，欢迎使用HanLP汉语处理包！"));

//		String content = "程序员(英文Programmer)是从事程序开发、维护的专业人员。一般将程序员分为程序设计人员和程序编码人员，但两者的界限并不非常清楚，特别是在中国。软件从业人员分为初级程序员、高级程序员、系统分析员和项目经理四大类。";
//		List<String> keywordList = HanLP.extractKeyword(content, 5);
//		System.out.println(keywordList);

		String[] testCase = new String[]{
		        "北川景子参演了林诣彬导演的《速度与激情3》",
		        "林志玲亮相网友:确定不是波多野结衣？",
		};
		Segment segment = HanLP.newSegment().enableJapaneseNameRecognize(true);
		for (String sentence : testCase)
		{
		    List<Term> termList = segment.seg(sentence);
		    System.out.println(termList);
		}
		System.out.println(HanLP.convertToTraditionalChinese("用笔记本电脑写程序"));
        System.out.println(HanLP.convertToSimplifiedChinese("「以後等妳當上皇后，就能買士多啤梨慶祝了」"));
		
//		List<Term> termList = NLPTokenizer.segment("中国科学院计算技术研究所的宗成庆教授正在教授自然语言处理课程");
//		System.out.println(termList);
	}

}
