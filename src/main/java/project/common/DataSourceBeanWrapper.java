package project.common;

import org.springframework.beans.factory.InitializingBean;

import javax.sql.DataSource;

public final class DataSourceBeanWrapper<T extends DataSource> implements InitializingBean {

    private T dataSource;

    public DataSourceBeanWrapper(T realDataSource) {
        super();
        this.dataSource = realDataSource;
    }

    public T getDataSource() {
        return dataSource;
    }

    public void setDataSource(T dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void afterPropertiesSet() throws Exception{
        if (this.dataSource == null) {
            throw new IllegalArgumentException("Property 'dataSources' is required");
        }
        if(this.dataSource instanceof InitializingBean){
            ((InitializingBean)dataSource).afterPropertiesSet();
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DataSourceBeanWrapper =");
        builder.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        builder.append("; dataSource=");
        builder.append(dataSource);
        return builder.toString();
    }
}