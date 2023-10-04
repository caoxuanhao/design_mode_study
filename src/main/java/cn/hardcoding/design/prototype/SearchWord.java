package cn.hardcoding.design.prototype;

/**
 * @ClassName SearchWord
 * @Author caoxuanhao
 * @Date 2023/10/5 0:26
 * @Description TODO
 */
public class SearchWord {
    private long lastUpdateTime;
    private String keyword;
    private Integer count;

    public long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
