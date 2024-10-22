package com.apptware.interview.stream.impl;

import com.apptware.interview.stream.DataReader;
import com.apptware.interview.stream.PaginationService;
import jakarta.annotation.Nonnull;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
class DataReaderImpl implements DataReader {

    @Autowired 
    private PaginationService paginationService;

    @Override
    public Stream<String> fetchLimitedData(int limit) { // Ensure method name matches exactly
        return fetchPaginatedDataAsStream().limit(limit);
    }

    @Override
    public Stream<String> fetchFullData() {
        return fetchPaginatedDataAsStream();
    }

    private @Nonnull Stream<String> fetchPaginatedDataAsStream() {
        log.info("Fetching paginated data as stream.");
        Stream<String> dataStream = Stream.empty(); // Temporary, will be replaced by the actual data stream
        return dataStream.peek(item -> log.info("Fetched Item: {}", item));
    }
}
