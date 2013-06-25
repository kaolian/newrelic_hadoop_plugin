package com.doctorchocolate.newrelic.plugins.hadoop;

import java.util.HashMap;
import java.util.HashSet;

public class NewRelicMetrics {

	static final HashMap<String, String> HadoopMetrics = new HashMap<String, String>();
	static final HashMap<String, Object> HadoopTags = new HashMap<String, Object>();
	static final HashSet<String> HadoopOverviewMetrics = new HashSet<String>();
	public static final String kDefaultMetricType="ms";
	public static final int kMetricInterval = 60;
	public static final char kMetricTreeDivider='/';
	public static final float kGigabytesToBytes=1073741824;
	public static final float kMegabytesToBytes=1048576;
	public static final String kCategoryMetricName="Component";
	public static final String kDeltaMetricName="delta";
	public static final String kOverviewMetricName="overview";
	
	public static final String kHadoopAgentVersion = "0.2";
	public static final String kHadoopAgentGuid = "com.doctorchocolate.newrelic.plugins.hadoop";

	static {	
		HadoopMetrics.put("shuffle_fetchers_busy_percent","%");
		HadoopMetrics.put("shuffle_handler_busy_percent","%");
		HadoopMetrics.put("BlockCapacity","blocks");
		HadoopMetrics.put("blocks_get_local_pathinfo","blocks");
		HadoopMetrics.put("blocks_read","blocks");
		HadoopMetrics.put("blocks_removed","blocks");
		HadoopMetrics.put("blocks_replicated","blocks");
		HadoopMetrics.put("blocks_verified","blocks");
		HadoopMetrics.put("blocks_written","blocks");
		HadoopMetrics.put("BlocksTotal","blocks");
		HadoopMetrics.put("CorruptBlocks","blocks");
		HadoopMetrics.put("ExcessBlocks","blocks");
		HadoopMetrics.put("GetBlockLocations","blocks");
		HadoopMetrics.put("MissingBlocks","blocks");
		HadoopMetrics.put("PendingDeletionBlocks","blocks");
		HadoopMetrics.put("PendingReplicationBlocks","blocks");
		HadoopMetrics.put("ScheduledReplicationBlocks","blocks");
		HadoopMetrics.put("TotalLoad","blocks");
		HadoopMetrics.put("UnderReplicatedBlocks","blocks");
		HadoopMetrics.put("bytes_read","bytes");
		HadoopMetrics.put("bytes_written","bytes");
		HadoopMetrics.put("CapacityRemainingGB","bytes");
		HadoopMetrics.put("CapacityTotalGB","bytes");
		HadoopMetrics.put("CapacityUsedGB","bytes");
		HadoopMetrics.put("memHeapCommittedM","bytes");
		HadoopMetrics.put("memHeapUsedM","bytes");
		HadoopMetrics.put("memNonHeapCommittedM","bytes");
		HadoopMetrics.put("memNonHeapUsedM","bytes");
		HadoopMetrics.put("ReceivedBytes","bytes");
		HadoopMetrics.put("SentBytes","bytes");
		HadoopMetrics.put("shuffle_input_bytes","bytes");
		HadoopMetrics.put("shuffle_output_bytes","bytes");
		HadoopMetrics.put("NumOpenConnections","connections");
		HadoopMetrics.put("shuffle_exceptions_caught","exceptions");
		HadoopMetrics.put("block_verification_failures","failures");
		HadoopMetrics.put("failedDirs","failures");
		HadoopMetrics.put("rpcAuthenticationFailures","failures");
		HadoopMetrics.put("rpcAuthorizationFailures","failures");
		HadoopMetrics.put("shuffle_success_fetches","fetches");
		HadoopMetrics.put("FilesAppended","files");
		HadoopMetrics.put("FilesCreated","files");
		HadoopMetrics.put("FilesDeleted","files");
		HadoopMetrics.put("FilesInGetListingOps","files");
		HadoopMetrics.put("FilesRenamed","files");
		HadoopMetrics.put("FilesTotal","files");
		HadoopMetrics.put("gcCount","GCs");
		HadoopMetrics.put("heartbeats","heartbeats");
		HadoopMetrics.put("jobs_completed","jobs");
		HadoopMetrics.put("jobs_failed","jobs");
		HadoopMetrics.put("jobs_killed","jobs");
		HadoopMetrics.put("jobs_preparing","jobs");
		HadoopMetrics.put("jobs_running","jobs");
		HadoopMetrics.put("jobs_submitted","jobs");
		HadoopMetrics.put("callQueueLen","length");
		HadoopMetrics.put("blacklisted_maps","maps");
		HadoopMetrics.put("maps_completed","maps");
		HadoopMetrics.put("maps_failed","maps");
		HadoopMetrics.put("maps_killed","maps");
		HadoopMetrics.put("maps_launched","maps");
		HadoopMetrics.put("maps_running","maps");
		HadoopMetrics.put("running_maps","maps");
		HadoopMetrics.put("waiting_maps","maps");
		HadoopMetrics.put("logError","messages");
		HadoopMetrics.put("logFatal","messages");
		HadoopMetrics.put("logInfo","messages");
		HadoopMetrics.put("logWarn","messages");
		HadoopMetrics.put("sink.file.dropped","metrics");
		HadoopMetrics.put("sink.file.qsize","metrics");
		HadoopMetrics.put("addBlock_num_ops","ops");
		HadoopMetrics.put("AddBlockOps","ops");
		HadoopMetrics.put("blockChecksumOp_num_ops","ops");
		HadoopMetrics.put("blockReceived_num_ops","ops");
		HadoopMetrics.put("blockReport_num_ops","ops");
		HadoopMetrics.put("blockReports_num_ops","ops");
		HadoopMetrics.put("blocksBeingWrittenReport_num_ops","ops");
		HadoopMetrics.put("canCommit_num_ops","ops");
		HadoopMetrics.put("commitPending_num_ops","ops");
		HadoopMetrics.put("complete_num_ops","ops");
		HadoopMetrics.put("copyBlockOp_num_ops","ops");
		HadoopMetrics.put("create_num_ops","ops");
		HadoopMetrics.put("CreateFileOps","ops");
		HadoopMetrics.put("delete_num_ops","ops");
		HadoopMetrics.put("DeleteFileOps","ops");
		HadoopMetrics.put("done_num_ops","ops");
		HadoopMetrics.put("FileInfoOps","ops");
		HadoopMetrics.put("getBlockLocations_num_ops","ops");
		HadoopMetrics.put("getEditLogSize_num_ops","ops");
		HadoopMetrics.put("getFileInfo_num_ops","ops");
		HadoopMetrics.put("getJobCounters_num_ops","ops");
		HadoopMetrics.put("getJobStatus_num_ops","ops");
		HadoopMetrics.put("getListing_num_ops","ops");
		HadoopMetrics.put("GetListingOps","ops");
		HadoopMetrics.put("getMapCompletionEvents_num_ops","ops");
		HadoopMetrics.put("getProtocolVersion_num_ops","ops");
		HadoopMetrics.put("getTask_num_ops","ops");
		HadoopMetrics.put("getTaskCompletionEvents_num_ops","ops");
		HadoopMetrics.put("heartbeat_num_ops","ops");
		HadoopMetrics.put("heartBeats_num_ops","ops");
		HadoopMetrics.put("loginFailure_num_ops","ops");
		HadoopMetrics.put("loginSuccess_num_ops","ops");
		HadoopMetrics.put("mkdirs_num_ops","ops");
		HadoopMetrics.put("ping_num_ops","ops");
		HadoopMetrics.put("publish_num_ops","ops");
		HadoopMetrics.put("readBlockOp_num_ops","ops");
		HadoopMetrics.put("register_num_ops","ops");
		HadoopMetrics.put("rename_num_ops","ops");
		HadoopMetrics.put("replaceBlockOp_num_ops","ops");
		HadoopMetrics.put("RpcProcessingTime_num_ops","ops");
		HadoopMetrics.put("RpcQueueTime_num_ops","ops");
		HadoopMetrics.put("sendHeartbeat_num_ops","ops");
		HadoopMetrics.put("sink.file.latency_num_ops","ops");
		HadoopMetrics.put("snapshot_num_ops","ops");
		HadoopMetrics.put("statusUpdate_num_ops","ops");
		HadoopMetrics.put("Syncs_num_ops","ops");
		HadoopMetrics.put("Transactions_num_ops","ops");
		HadoopMetrics.put("versionRequest_num_ops","ops");
		HadoopMetrics.put("writeBlockOp_num_ops","ops");
		HadoopMetrics.put("shuffle_failed_outputs","outputs");
		HadoopMetrics.put("shuffle_success_outputs","outputs");
		HadoopMetrics.put("reads_from_local_client","reads");
		HadoopMetrics.put("reads_from_remote_client","reads");
		HadoopMetrics.put("blacklisted_reduces","reduces");
		HadoopMetrics.put("reduces_completed","reduces");
		HadoopMetrics.put("reduces_failed","reduces");
		HadoopMetrics.put("reduces_killed","reduces");
		HadoopMetrics.put("reduces_launched","reduces");
		HadoopMetrics.put("reduces_running","reduces");
		HadoopMetrics.put("running_reduces","reduces");
		HadoopMetrics.put("waiting_reduces","reduces");
		HadoopMetrics.put("num_sinks","sinks");
		HadoopMetrics.put("running_0","jobs ");
		HadoopMetrics.put("running_1440","jobs");
		HadoopMetrics.put("running_300","jobs");
		HadoopMetrics.put("running_60","jobs");
		HadoopMetrics.put("sink.file.qsize","count");
		HadoopMetrics.put("map_slots","slots");
		HadoopMetrics.put("mapTaskSlots","slots");
		HadoopMetrics.put("occupied_map_slots","slots");
		HadoopMetrics.put("occupied_reduce_slots","slots");
		HadoopMetrics.put("reduce_slots","slots");
		HadoopMetrics.put("reduceTaskSlots","slots");
		HadoopMetrics.put("reserved_map_slots","slots");
		HadoopMetrics.put("reserved_reduce_slots","slots");
		HadoopMetrics.put("num_sources","sources");
		HadoopMetrics.put("rpcAuthenticationSuccesses","successes");
		HadoopMetrics.put("rpcAuthorizationSuccesses","successes");
		HadoopMetrics.put("tasks_completed","tasks");
		HadoopMetrics.put("tasks_failed_ping","tasks");
		HadoopMetrics.put("tasks_failedtimeout","tasks");
		HadoopMetrics.put("threadsBlocked","threads");
		HadoopMetrics.put("threadsNew","threads");
		HadoopMetrics.put("threadsRunnable","threads");
		HadoopMetrics.put("threadsTerminated","threads");
		HadoopMetrics.put("threadsTimedWaiting","threads");
		HadoopMetrics.put("threadsWaiting","threads");
		HadoopMetrics.put("trackers","trackers");
		HadoopMetrics.put("trackers_blacklisted","trackers");
		HadoopMetrics.put("trackers_decommissioned","trackers");
		HadoopMetrics.put("trackers_graylisted","trackers");
		HadoopMetrics.put("JournalTransactionsBatchedInSync","transactions");
		HadoopMetrics.put("dropped_pub_all","updates");
		HadoopMetrics.put("sink.file.dropped","updates");
		HadoopMetrics.put("writes_from_local_client","writes");
		HadoopMetrics.put("writes_from_remote_client","writes");
	}

	// 0 = skip, 1 = host, 2 = port
	static {	
		HadoopTags.put("hostName", 1);
		HadoopTags.put("port", 2);
		HadoopTags.put("hostName", 0);
		HadoopTags.put("port", 0);
		HadoopTags.put("context", 0);
		HadoopTags.put("jobId", 0);
		HadoopTags.put("sessionId", 0);
		HadoopTags.put("taskId", 0);
		HadoopTags.put("context", 0);
		HadoopTags.put("processName", 0);
	}
	
	// List metrics that should appear in overview
	static {
		HadoopOverviewMetrics.add("ops");
		HadoopOverviewMetrics.add("maps");
		HadoopOverviewMetrics.add("reduces");
	}
}
