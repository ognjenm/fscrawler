/*
 * Licensed to David Pilato (the "Author") under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Author licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package fr.pilato.elasticsearch.crawler.fs.settings;

public class Ocr {
    // Language dictionary to be used.
    private String language = "eng";
    // Path to tesseract program
    private String path = null;
    // Path to tesseract data
    private String dataPath = null;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String language = "eng";
        private String path = null;
        private String dataPath = null;

        public Builder setLanguage(String language) {
            this.language = language;
            return this;
        }

        public Builder setPath(String path) {
            this.path = path;
            return this;
        }

        public Builder setDataPath(String dataPath) {
            this.dataPath = dataPath;
            return this;
        }

        public Ocr build() {
            return new Ocr(language, path, dataPath);
        }

    }

    public Ocr( ) {

    }

    private Ocr(String language, String path, String dataPath) {
        this.language = language;
        this.path = path;
        this.dataPath = dataPath;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDataPath() {
        return dataPath;
    }

    public void setDataPath(String dataPath) {
        this.dataPath = dataPath;
    }
}
