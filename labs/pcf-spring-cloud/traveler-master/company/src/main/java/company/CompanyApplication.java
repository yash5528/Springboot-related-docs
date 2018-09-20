/*
 * Copyright 2017-Present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 package company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class CompanyApplication {

    @RequestMapping("/available")
    public String available() {
      List<String> guides = Arrays.asList("Melchior", "Gaspar", "Balthazar");
      Random rand = new Random();

      int randomNum = rand.nextInt(guides.size());
      return guides.get(randomNum);
    }

    public static void main(String[] args) {
        SpringApplication.run(CompanyApplication.class, args);
    }
}
