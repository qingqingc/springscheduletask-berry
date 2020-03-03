package hello;

import java.util.HashSet;
import java.util.Set;

import javax.crypto.spec.DESedeKeySpec;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

public class JedisFirst {

	public static void main(String[] args) {
		Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
		//Jedis Cluster will attempt to discover cluster nodes automatically
		jedisClusterNodes.add(new HostAndPort("172.20.10.3", 7000));
		JedisCluster jc = new JedisCluster(jedisClusterNodes);
		jc.set("foo", "bar");
		String value = jc.get("foo");
		String s = null;

	}

}
