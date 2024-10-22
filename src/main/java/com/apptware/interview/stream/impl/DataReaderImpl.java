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
public class DataReaderImpl implements DataReader {

    @Override
    public List<String> fetchLimitedData(int limit) {
        // Implement your logic here to fetch limited data
        return new ArrayList<>();
    }
}


    @Autowired
    private PaginationService paginationService;

    @Override
    public Stream<String> fetchLimitadData(int limit) {
        return fetchPaginatedDataAsStream().limit(limit);
    }

    @Override
    public Stream<String> fetchFullData() {
        return fetchPaginatedDataAsStream();
    }

    /**
     * This method is where the candidate should add the implementation. Logs have been added to track
     * the data fetching behavior. Do not modify any other areas of the code.
     */
    private @Nonnull Stream<String> fetchPaginatedDataAsStream() {
        log.info("Fetching paginated data as stream.");

        // Placeholder for paginated data fetching logic
        // The candidate will add the actual implementation here

        // Example: Fetch data using paginationService
        // Stream<String> dataStream = paginationService.fetchData();

        Stream<String> dataStream = Stream.empty(); // Temporary, will be replaced by the actual data stream
        return dataStream.peek(item -> log.info("Fetched Item: {}", item));
    }
}
