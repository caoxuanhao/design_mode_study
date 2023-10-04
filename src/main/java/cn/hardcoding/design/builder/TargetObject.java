package cn.hardcoding.design.builder;

/**
 * @ClassName TargetObject
 * @Author caoxuanhao
 * @Date 2023/10/4 23:23
 * @Description 建造者模式实现类
 */
public class TargetObject {
    private String name;
    private Integer maxTotal;
    private Integer maxIdle;
    private Integer minIdle;

    private TargetObject(Builder builder) {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
    }

    @Override
    public String toString() {
        return "TargetObject{" +
                "name='" + name + '\'' +
                ", maxTotal=" + maxTotal +
                ", maxIdle=" + maxIdle +
                ", minIdle=" + minIdle +
                '}';
    }

    public static class Builder {
        private static final int DEFAULT_MAX_TOTAL = 8;
        private static final int DEFAULT_MAX_IDLE = 8;
        private static final int DEFAULT_MIN_IDLE = 0;

        private String name;
        private Integer maxTotal = DEFAULT_MAX_TOTAL;
        private Integer maxIdle = DEFAULT_MAX_IDLE;
        private Integer minIdle = DEFAULT_MIN_IDLE;

        /**
         * build 方法中可以定义属性见的逻辑关系
         * 说明：可以将必填项添加到构造函数中，但是还是需要添加必要的非空校验。
         * @return
         */
        public TargetObject build() {
            if (null == name) {
                throw new IllegalArgumentException("name should not be empty.");
            }
            if (maxIdle > maxTotal) {
                throw new IllegalArgumentException("...");
            }
            if (minIdle > maxTotal || minIdle > maxIdle) {
                throw new IllegalArgumentException("...");
            }
            return new TargetObject(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setMaxTotal(Integer maxTotal) {
            this.maxTotal = maxTotal;
            return this;
        }

        public Builder setMaxIdle(Integer maxIdle) {
            this.maxIdle = maxIdle;
            return this;
        }

        public Builder setMinIdle(Integer minIdle) {
            this.minIdle = minIdle;
            return this;
        }
    }
}
