import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
	public List<Interval> merge(List<Interval> intervals) {
		List<Interval> res = new ArrayList<>();
		if (intervals.size() <= 1) {
			return intervals;
		}
		
		/** 下面三种排序时间递减*/
//		for (int i = 0; i < intervals.size(); i++) {
//			for (int j = i + 1; j < intervals.size(); j++) {
//				if (intervals.get(i).start > intervals.get(j).start) {
//					Interval tmp = intervals.get(i);
//					intervals.set(i, intervals.get(j));
//					intervals.set(j, tmp);
//				}
//			}
//		}
		
//		intervals.sort(new Comparator<Interval>() {
//
//			@Override
//			public int compare(Interval o1, Interval o2) {
//				return o1.start - o2.start;
//			}
//			
//		});
		
		Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start != o2.start ? o1.start - o2.start : o1.end - o2.end;
            }
        });
		
		/** 按顺序根据区间是否重叠，加入到结果List<Interval> res保存 */
		int min = intervals.get(0).start;
		int max = intervals.get(0).end;
		for (int i = 1; i < intervals.size(); i++) {
			if (max >= intervals.get(i).start) {
				max = (max >= intervals.get(i).end) ? max : intervals.get(i).end;
			} else {
				res.add(new Interval(min, max));
				min = intervals.get(i).start;
				max = intervals.get(i).end;
			}
		}
		res.add(new Interval(min, max));
		return res;
	}

}