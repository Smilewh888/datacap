---
template: main.html
title: DataCap

hide:
- navigation
- toc
- footer
---

<style xmlns="http://www.w3.org/1999/html">
.md-typeset h1 {
  text-align: center;
  color: transparent;
}
.md-typeset h2 {
  text-align: center;
  font-weight: 1000;
  font-size: 50px;
  margin-top: 60px;
  margin-bottom: 0;
}
</style>

<div style="text-align: center;">
    <img width="100" height="85" style="margin-top: -50px;" src="/assets/logo.png" />
    <p/>DataCap 是用于数据转换、集成和可视化的集成软件。
    <p/>支持多种数据源、文件类型、大数据相关数据库、关系数据库、NoSQL数据库等。
    <p/>通过软件可以实现多数据源的管理，对源下的数据进行各种操作转换、制作数据图表、监控数据源和其他功能。
    <p/>
    <a target="_blank" href="https://gitee.com/devlive-community/datacap/members">
        <img src='https://gitee.com/devlive-community/datacap/badge/fork.svg?theme=white' alt='fork'/>
    </a>
    <a target="_blank" href="https://gitee.com/devlive-community/datacap/stargazers">
        <img src='https://gitee.com/devlive-community/datacap/badge/star.svg?theme=white' alt='star'/>
    </a>
    <a target="_blank" href="https://github.com/devlive-community/datacap/fork">
        <img alt="GitHub stars" src="https://img.shields.io/github/forks/devlive-community/datacap?logo=github">
    </a>
    <a target="_blank" href="https://github.com/devlive-community/datacap/stargazers">
        <img alt="GitHub stars" src="https://img.shields.io/github/stars/devlive-community/datacap?logo=github">
    </a>
    <p/> 
    <p/>
    <a href="/reference/getStarted/install.html" title="马上开始" class="md-button">
        马上开始
    </a>
    <a href="/download.html" title="下载" class="md-button">
      下载
    </a>
    <a href="https://github.com/devlive-community/datacap" target="_blank" title="在 GitHub 上加入我们" class="md-button md-button--primary">
      在 GitHub 上加入我们
    </a>
    <a href="http://try.datacap.edurt.io/" target="_blank" title="查看在线 Demo" class="md-button md-button--primary">
      查看在线 Demo
    </a>
    <p/><p/><p/><p/>
</div>

## 概述

<div style="max-width: 60%; text-align: center;margin: 0 auto;">
<p style="text-align: center;">
Datacap 是快速、轻量级、直观的系统。它可以用来管理多数据源，对源下的数据进行各种操作转换、制作数据图表、监控数据源和其他功能。也可以用来做数据库管理系统，对源下的数据进行增删改查等各种操作。
</p>
</div>

<div style="max-width: 800px; margin: 0 auto" class="grid cards" markdown>

- __功能强大但易于使用__ 

    ---

    DataCap 使用简单的 SQL IDE 快速轻松地集成和探索您的数据。

- __与现代数据库集成__

    ---

    DataCap 可以通过 JDBC, Native, Http 等各种协议连接到任何基于 SQL | NoSQL 的数据源。

- __高度定制化__

    ---

    DataCap 可以通过实现插件 SPI 提供的方式可以快速定制化您的数据源。也可以通过实现执行器 SPI 定制化您的数据转换集成工具。

- __加入 (钉钉 ｜ 微信)__

    ---

    <img src="/assets/dingtalk.png" alt="钉钉" style="height: 180px;" /><img src="/assets/wechat.png" alt="微信" style="height: 180px;" />

</div>

## 支持的连接器

<div class="grid cards" markdown>

- <a href="https://clickhouse.com" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/clickhouse.png" alt="ClickHouse" />
  </a>
- <a href="https://www.mysql.com" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/mysql.png" alt="MySQL" />
  </a>
- <a href="https://prestodb.io/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/presto.png" alt="Presto" height="50"/>
  </a>
- <a href="https://redis.io/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/redis.png" alt="Redis" height="50"/>
  </a>
- <a href="https://www.postgresql.org/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/postgresql.png" alt="PostgreSQL" height="50"/>
  </a>
- <a href="https://trino.io/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/trino.png" alt="Trino" height="50"/>
  </a>
- <a href="https://www.elastic.co/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/elasticsearch.png" alt="ElasticSearch" height="50" />
  </a>
- <a href="https://druid.apache.org/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/druid.png" alt="Druid" height="50" />
  </a>
- <a href="https://kyuubi.apache.org/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/kyuubi.png" alt="Kyuubi" height="50"/>
  </a>
- <a href="https://hive.apache.org/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/hive.png" alt="Hive" height="50" />
  </a>
- <a href="https://kylin.apache.org" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/kylin.png" alt="Kylin" height="50" />
  </a>
- <a href="https://ignite.apache.org/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/ignite.png" alt="Ignite" height="50" />
  </a>
- <a href="https://www.ibm.com/db2/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/ibmdb2.png" alt="IBM DB2" height="50" />
  </a>
- <a href="https://www.mongodb.com/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/mongodb.png" alt="MongoDB" height="50" />
  </a>
- <a href="https://www.dremio.com/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/dremio.png" alt="Dremio" height="50" />
  </a>
- <a href="https://www.monetdb.org/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/monetdb.png" alt="MonetDB" height="50" />
  </a>
- <a href="https://phoenix.apache.org/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/phoenix.png" alt="Phoenix" height="50" />
  </a>
- <a href="https://www.h2database.com/html/main.html" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/h2.png" alt="H2" height="50" />
  </a>
- <a href="https://www.microsoft.com/sql-server" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/sqlserver.svg" alt="SqlServer" height="60" />
  </a>
- <a href="https://www.oracle.com/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/oracle.png" alt="Oracle" height="50" />
  </a>
- <a href="https://crate.io/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/cratedb.png" alt="CrateDB" height="50" />
  </a>
- <a href="https://www.dameng.com/DM8.html" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/dameng.png" alt="DaMeng" height="50" />
  </a>
- <a href="https://tdengine.com/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/tdengine.png" alt="TDengine" height="50" />
  </a>
- <a href="https://impala.apache.org/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/impala.png" alt="Impala" height="50" />
  </a>
- <a href="https://www.oceanbase.com/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/oceanbase.png" alt="OceanBase" height="50" />
  </a>
- <a href="https://neo4j.com/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/neo4j.png" alt="Neo4j" height="50" />
  </a>
- <a href="https://iotdb.apache.org/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/iotdb.png" alt="IoTDB" height="50" />
  </a>
- <a href="https://www.snowflake.com/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/snowflake.png" alt="Snowflake" height="70" />
  </a>
- <a href="https://ydb.tech/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/ydb.png" alt="YDB" height="50" />
  </a>
- <a href="https://zookeeper.apache.org/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/zookeeper.png" alt="Zookeeper" height="50" />
  </a>
- <a href="https://duckdb.org/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/duckdb.png" alt="DuckDB" height="50" />
  </a>
- <a href="https://www.alibabacloud.com/zh/product/object-storage-service" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/alioss.png" alt="Aliyun OSS" height="50" />
  </a>
- <a href="https://kafka.apache.org" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/kafka.png" alt="Apache Kafka" height="50" />
  </a>
- <a href="https://docs.ceresdb.io/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/ceresdb.png" alt="CeresDB" height="50" />
  </a>
- <a href="https://docs.greptime.com/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/greptimedb.png" alt="GreptimeDB" height="70" />
  </a>
- <a href="https://questdb.io/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/questdb.png" alt="QuestDB" height="50" />
  </a>
- <a href="https://doris.apache.org/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/doris.png" alt="Apache Doris" height="50" />
  </a>
- <a href="https://www.starrocks.io/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/starrocks.png" alt="StarRocks" height="50" />
  </a>
- <a href="https://www.alibabacloud.com/product/hologres" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/hologres.png" alt="Hologres" height=60" />
  </a>
- <a href="https://hadoop.apache.org/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/hdfs.png" alt="Apache Hdfs" height=60" />
  </a>
- <a href="https://docs.pinot.apache.org/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/pinot.png" alt="Apache Pinot" height=60" />
  </a>
- <a href="https://cassandra.apache.org/" target="_blank" class="connector-logo-index">
      <img src="/assets/plugin/cassandra.png" alt="Apache Cassandra" height=60" />
  </a>

</div>
