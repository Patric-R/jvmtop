package com.jvmtop.profiler;

import java.util.ArrayList;
import java.util.List;

public class Config {
    public int screenMaxWidth = 280;
    public double minCost = 5.0;
    public double minTotal = 5.0;
    public int maxDepth = 15;
    public boolean canSkip = false;
    public boolean printTotal = false;
    public int threadsLimit = Integer.MAX_VALUE;
    public List<Long> profileThreadIds = new ArrayList<Long>();
    public String fileVisualize;
    public boolean profileRealTime;
    public List<String> profileThreadNames = new ArrayList<String>();

    public Config(Integer screenMaxWidth, Double minCost, Double minTotal, Integer maxDepth, Integer threadsLimit,
                  boolean canSkip, boolean printTotal, boolean profileRealTime,
                  List<Long> profileThreadIds, List<String> profileThreadNames,
                  String fileVisualize) {
        if (screenMaxWidth != null)     this.screenMaxWidth = screenMaxWidth;
        if (minCost != null)            this.minCost = minCost;
        if (minTotal != null)           this.minTotal = minTotal;
        if (maxDepth != null)           this.maxDepth = maxDepth;
        if (threadsLimit != null)       this.threadsLimit = threadsLimit;
        if (profileThreadIds != null)   this.profileThreadIds = profileThreadIds;
        if (profileThreadNames != null) this.profileThreadNames = profileThreadNames;
        if (fileVisualize != null)      this.fileVisualize = fileVisualize;
        this.canSkip = canSkip;
        this.printTotal = printTotal;
        this.profileRealTime = profileRealTime;
    }
}
