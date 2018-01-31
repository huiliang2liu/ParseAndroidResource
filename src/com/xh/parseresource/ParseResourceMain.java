package com.xh.parseresource;

import java.util.List;

import com.xh.parseresource.ParseResourceUtils.Res;

public class ParseResourceMain {

	public static void main(String[] args) {
		// System.out.println(Integer.valueOf("fea701", 16));
		// long start_time = System.currentTimeMillis();
		System.out.println(19546453/1024/1024);
		ParseResourceUtils parseResource = new ParseResourceUtils(
				"resource/resources.arsc");
		 System.out.println(parseResource.packageName);
		List<Res> resStringList = parseResource.layout;
		if (resStringList != null) {
			//
			// // long search_time=System.currentTimeMillis();
			// // Res res=new Res();
			// // res.name="app_name_wan73";
			// // res.id=2131230748;
			// // 2130903072
			// // System.out.println("查找");
			// // int index=Collections.binarySearch(resStringList, res);
			// // System.out.println(index);
			// // System.out.println(resStringList.get(index));
			// // 2131230748
			// // name=video id=2131230746 value=[视频]
			// // name=searhc_search id=2130837820
			// // value=res/drawable-hdpi/searhc_search.png
			// // try {
			// // System.out.println(parseResource.drawable(2130837820));
			// // } catch (Exception e) {
			// // // TODO: handle exception
			// // e.printStackTrace();
			// // }
			// // System.out.println(System.currentTimeMillis()-search_time);
			for (Res string : resStringList) {
					System.out.println(string);
			}
			// // try {
			// // String str = "FFFFFFff";
			// // Long in = Long.valueOf(str,16);
			// // System.out.println(in-Integer.MAX_VALUE);
			// // } catch (Exception e) {
			// // // TODO: handle exception
			// // e.printStackTrace();
			// // }
		}

		// System.out.println(System.currentTimeMillis() - start_time);
		String s = "http://wiki.tvblack.com/pages/viewpage.action?pageId=2850820";
		String[] ss = s.split("/");
		System.out.println(ss[ss.length - 1]);
	}

}
