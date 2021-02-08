package ru.job4j.collection;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.greaterThan;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorterTest {
    @Test
    public void jobSortDecPriorityTest() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        Collections.sort(jobs, new JobSortDecPriority());
        List<Job> expect = Arrays.asList(
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("Fix bug", 1),
                new Job("X task", 0)
        );
        assertThat(expect, is(jobs));
    }

    @Test
    public void jobSortIncPriorityTest() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        Collections.sort(jobs, new JobSortIncPriority());
        List<Job> expect = Arrays.asList(
                new Job("X task", 0),
                new Job("Fix bug", 1),
                new Job("Fix bug", 2),
                new Job("Fix bug", 4)
        );
        assertThat(expect, is(jobs));
    }

    @Test
    public void jobSortDecNameTest() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("X task", 0),
                new Job("Fix bug", 2)
        );
        Collections.sort(jobs, new JobSortDecName());
        List<Job> expect = Arrays.asList(
                new Job("X task", 0),
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2)
        );
        assertThat(expect, is(jobs));
    }

    @Test
    public void jobSortIncNameTest() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("X task", 0),
                new Job("Fix bug", 2)
        );
        Collections.sort(jobs, new JobSortIncName());
        List<Job> expect = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        assertThat(expect, is(jobs));
    }

    @Test
    public void sortIncNameIncPriority() {
        Comparator<Job> comparator = new JobSortIncName().thenComparing(new JobSortIncPriority());
        int rsl = comparator.compare(
                new Job("Fix bug", 4),
                new Job("Fix bug", 2)
        );
        assertThat(rsl, greaterThan(0));
        rsl = comparator.compare(
                new Job("Big value", 4),
                new Job("Fix bug", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void sortDecNameDecPriority() {
        Comparator<Job> comparator = new JobSortDecName().thenComparing(new JobSortDecPriority());
        int rsl = comparator.compare(
                new Job("Fix bug", 4),
                new Job("Fix bug", 2)
        );
        assertThat(rsl, lessThan(0));
        rsl = comparator.compare(
                new Job("Big value", 4),
                new Job("Fix bug", 2)
        );
        assertThat(rsl, greaterThan(0));
    }
}